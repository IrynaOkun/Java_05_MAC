import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    //positive

    @Test
    public void testNegativeNumber () {

            //AAA
            //arrange

            int number = -345;
            String expectedResult = "Odd";

            //act
            String actualResult = new OddEven().oddEven(number);

            //assert
            Assert.assertEquals(actualResult, expectedResult);

        }

    //

    @Test
    public void testZeroNumber() {
        //Arrange
        int number = 0;
        String expectedResult = "Even";
        //act
        String actualResult = new OddEven().oddEven(number);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwos() {
        int number = 222222;
        String expectedResult = "Even";
        //act
        String actualResult = new OddEven().oddEven(number);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }










}
