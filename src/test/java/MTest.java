import org.testng.Assert;
import org.testng.annotations.Test;

public class MTest {

    @Test
    public void testM1() {
        int m = 11;
        String actualResult1 = "-1";

        String expectedResult1 = new M().mTest(m);

        Assert.assertEquals(actualResult1, expectedResult1);
    }

    @Test
    public void testM2() {
        int m = 11;
        String actualResult1 = "Poor Number";

        String expectedResult1 = new M().mTest(m);

        Assert.assertEquals(actualResult1, expectedResult1);
    }

    @Test
    public void testM3() {
        int m = 7;
        String actualResult1 = "-1";

        String expectedResult1 = new M().mTest(m);

        Assert.assertEquals(actualResult1, expectedResult1);
    }
}
