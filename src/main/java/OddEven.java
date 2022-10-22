public class OddEven {

    /**
     * В классе OddEven создать алгоритм oddEven(),
     * который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
     *
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     */

//    public String oddEven (int number) {
//        if (number % 2 == 0) {
//            System.out.println("Even");
//        }
//
//        return "Odd";
//    }

    public String oddEven(long number) {
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if(number <= 2147483647L && number >= -2147483648L) {
            if (number % 2 == 0) {

                return even;
            } else {

                return odd;
            }
        }

        return undefined;
    }

}


