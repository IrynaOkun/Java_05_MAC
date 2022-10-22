import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumber() {
        int x = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(x);

        Assert.assertEquals(actualResult, expectedResult);


    }
}
