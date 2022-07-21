import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "{index}:{0}")
    public static Object[][] setParam() {
        return new Object[][]{
                {"АннаАхметова", false},
                {" Ivan Grozniy ", false},
                {"кто-то еще ", false},
                {" еще кто-то", false},
                {" ФамилияИмя", false},
                {"   ", false},
                {"1 3", true},
                {"12", false},
                {"11111111 1111111119", true},
                {"1111111111 111111120", false},
                {null, false},
                {"Анна Ахметова", true},
                {"Ivan Grozniy", true}
        };
    }

    @Test
    public void checkValidationMethod() {
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
