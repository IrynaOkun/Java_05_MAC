public class OddIndices {



//    public int[] OddIndices(int[] array) {
//        if (array.length != 0) {
//            int countOdd = 0;
//            for (int i = 0;  i < array.length; i++) {
//                if (i % 2 != 0) {
//
//                    countOdd++;
//                }
//            }
//            int[] array1 = new int[countOdd];
//            int j = 0;
//            for (int i = 0; i < array.length; i++) {
//
//                if (i % 2 != 0) {
//
//                    array1[j] = array[i];
//
//                    j++;
//                }
//            }
//
//            return array1;
//        }
//
//        return new int[]{};
//    }
//    public int[] OddIndices(int[] array) {
//        if (array.length != 0) {
//        int[] array1 = new int[array.length / 2];
//        int j = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                array1[j] = array[i];
//                j++;
//            }
//        }
//
//        return array1;
//    }
//
//        return new int[]{};
//    }

    /**Написать алгоритм OddIndices, который принимает массив целых чисел, и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public int[] OddIndices(int[] array) {
        if (array.length != 0) {
            int[] array1 = new int[array.length / 2];
            int j = 0;
            for (int i = 1; i < array.length; i+=2) {
                //if (i % 2 != 0) {
                    array1[j] = array[i];
                    j++;
               // }
            }

            return array1;
        }

        return new int[]{};
    }

}
