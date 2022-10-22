public class BiggerValue {

    /**
     * Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    public int biggerValue(int a, int b) {
        if (a > b) {

            return a;
        } else if (b > a) {

            return b;
        }

        return a = b;
    }
}
