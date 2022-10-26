import java.util.Arrays;

public class CreateArray {

    /** Task 1.1 Arrays
     * В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
     * который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     * Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     *
     *
     * Task_1
     * В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
     * который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     * Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     *
     * Task_2
     * Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
     * и возвращает массив из этих же чисел
     * Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     *
     * Task_3
     * Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
     * Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     *
     * Task_4
     * //4я задача только для тех, кто хочет разобраться с методом класса String split()
     * Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов
     * и возвращает массив из этих слов.
     * Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */


    // Task_1

    public int[] createIntArray(int a, int b, int c, int d, int e) {

        return new int[] {a, b, c, d, e};
    }

    // Task_2
    public double[] createDoubleArray(double a, double b, double c, double d, double e) {

        return new double[] {a, b, c, d, e};
    }

    // Task_3
    public String[] createStringArray(String a, String b, String c, String d, String e) {

        return new String[] {a, b, c, d, e};
    }

    //4
    public static String[] createArrayFromText(String sentence) {

        return sentence.split(" ");

    }




    public static void main(String[] args) {

        String sentence2 = "Каждый охотник желает знать где сидит фазан";

        createArrayFromText(sentence2);

        System.out.println(Arrays.toString(createArrayFromText(sentence2)));

    }



}
