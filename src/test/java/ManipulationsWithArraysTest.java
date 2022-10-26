import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    //Task_5
    public void testmultiplуArrayByNumber() {

        int[] array = {1, 2, 3, 4, 5};
        int number = 10;

        int[] actualResult = {10, 20, 30, 40, 50};

        int[] expectedResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testmultiplуArrayByNumberThree() {

        int[] array = {1, 2, 3, 4, 5};
        int number = 3;

        int[] actualResult = {3, 6, 9, 12, 15};

        int[] expectedResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
