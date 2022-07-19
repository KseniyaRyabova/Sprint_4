import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NegativeAccountTest {
    private final String name;
    private final boolean expectedResult;

    public NegativeAccountTest(String name, boolean expectedResult) {
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
                {" ФамилияИмя", false}
        };
    }

    @Test
    public void checkValidationMethod() {
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
