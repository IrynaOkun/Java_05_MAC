public class SumOfNumbersOfArray {

    /**
     * Написать алгоритм SumArray,
     * который возвращает сумму всех чисел массива
     *
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     *
     */

    public int sumOfNumbersOfArray(int[] array) {
        int sumOfNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfNumbers += array[i];
        }

        return sumOfNumbers++;
    }






}
