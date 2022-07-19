import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PositiveAccountTest {
    private final String name;
    private final boolean expectedResult;

    public PositiveAccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "{index}:{0}")
    public static Object[][] setParam() {
        return new Object[][] {
                {"Анна Ахметова", true},
                {"Ivan Grozniy", true},
        };
    }

    @Test
    public void checkValidationMethod() {
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
