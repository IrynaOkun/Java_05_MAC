import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class StringMethodsTest {

    //Task_1
    @Test
    public void testIsEmptyString() {
         String first = "";
         String actualResult = "Строка пустая";

         String expectedResult = new StringMethods().removeSpaces(first);

        Assert.assertEquals(actualResult, expectedResult);


    }

    //@Ignore
    @Test
    public void testNoSpaces() {
        String first = "Red Rover School";
        String actualResult = "Пробелов не было";

        String expectedResult = new StringMethods().removeSpaces(first);

        Assert.assertEquals(actualResult, expectedResult);


    }

    //@Ignore
    @Test

    public void testSpacesDeleted() {
        String first = "    Red Rover School   ";
        String actualResult = "Лишние пробелы удалены";

        String expectedResult = new StringMethods().removeSpaces(first);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Task_2
    @Test
    public void testRemoveAllSpaces() {
        String second = "    Red Rover School   ";
        String actualResult = "Red Rover School";

        String expectedResult = new StringMethods().removeAlleAs(second);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testRemoveAllAs() {
        String second = "panda   ";
        String actualResult = "pnd";

        String expectedResult = new StringMethods().removeAlleAs(second);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testRemoveAllAs2() {
        String second = "taramasalata";
        String actualResult = "trmslt";

        String expectedResult = new StringMethods().removeAlleAs(second);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Task_3
    @Test
    public void testRemoveAllZeros() {
        String third = "3504209706040000 ";
        String actualResult = "35429764";

        String expectedResult = new StringMethods().removeAllZeros(third);

        Assert.assertEquals(actualResult, expectedResult);

    }

}
