public class IsPositiveNumber {

    /**
     * Напишите алгоритм IsPositiveNumber, который возвращает true,
     * если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
     * Проверьте работу метода на числах 555, 0 и -555.
     */

    public boolean isPositiveNumber(int x) {
        boolean m = true;
        if (x >= 0) {

            return m = true;
        }
        else if (x < 0) {

            return m = false;
        }

        return m;
    }
}
