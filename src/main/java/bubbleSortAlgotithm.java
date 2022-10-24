import java.util.Arrays;

public class bubbleSortAlgotithm {


    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 25, 20, 2, 12, 312, -120,142, 123, 12, 32, 1, 2, -10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                int temp = arr[i];
                if (temp > arr[j]) {
                    int x = arr[j];
                    arr[i] = x;
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
