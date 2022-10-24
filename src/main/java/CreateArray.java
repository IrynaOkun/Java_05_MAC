public class CreateArray {

    /**
     * В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
     * который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     * Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */

    //
    public int[] createInArray(int a, int b, int c, int d, int e) {

        return new int[]  {a, b, c, d, e};

    }

    //4
    public String[] createArrayFromText(String sentence) {

        return sentence.split(" ");

    }



}
