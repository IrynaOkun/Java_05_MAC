public class ManipulationWithArrays {

    //Умножить массив на число

    public int[] multiplyArrayWithNumber(int[] array, int number) {

        if (array == null) {
            return null;
        }

//        if (array == null) {
//        } //ifn_syntaxis

        int[] arrayOfProducts = new int[array.length];

        if (number == 0) {

            return arrayOfProducts;
        }
        if (array == null || array.length == 0) {

            return new int[0];
        }


        for (int i = 0; i < array.length; i++) {
            int product = array[i] * number;

        }

        return array;
    }


}
