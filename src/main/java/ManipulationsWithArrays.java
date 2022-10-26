import java.util.Arrays;

public class ManipulationsWithArrays {

    /** Task_5
     * Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     * Метод возвращает массив тех же чисел, умноженных на number
     * Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    public int[] multiplуArrayByNumber(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1)  * number;
        }

        return array;
    }

    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5};
//        int number = 10;
//
//        multiplуArrayByNumber(array, number);
    }


}
