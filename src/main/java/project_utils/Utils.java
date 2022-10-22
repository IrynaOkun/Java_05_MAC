package project_utils;

public class Utils {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    static String dolphin = "\uD83D\uDC2C";
    static String tulip = "\uD83C\uDF37";
    static String bug = "\uD83D\uDC1E";
    static String line = "__________";
    static String lineRight = "]تالفقغفعهغككككثشثسثس";
    static String lineLeft = "تالفقغفعهغككككثشثسثس[";
    static String task = "Task № ";
    static String dot = ".";
    static int numberSub = 1;
    static int taskNumber = 1;
    static int tcNumber = 1;
    static int tcNumberSub = 1;

    static int currentTaskNumber = 3;


    //Вспомогательные методы для печати отчета тестирования

    public static void printTaskNumberTulip() {
        System.out.println(lineLeft + tulip
                + task + taskNumber++ + tulip + lineRight);
    }

    public static void printTaskNumberDolphin() {
        System.out.println(lineLeft + dolphin + task + taskNumber++ + dolphin + lineRight);
    }

    public static void printTaskNumberWithIndexBug() {
        System.out.println(line+ bug + task + taskNumber++ + dot + numberSub++ + bug + line);
    }

    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "\t--\t");
    }

    public static void printTCSubNumber() {
        System.out.print("TC_" + currentTaskNumber + "." + tcNumberSub++ + "\t--\t");
    }

    public static void printTestResult(String value) {
        System.out.println(value);
        System.out.println();
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static String verifyEqualsInt(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static String verifyEqualsDouble(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    //MethodFrom22Task
    public static int methodTask22(int[] array) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;

    }

    //Сумма элементов массива
    public static int sumArray(int[] numArr) {
        if (numArr != null) {
            int result = 0;
            for (int i : numArr) {
                result += i;
            }

            return result;
        }

        return 0;
    }

    //BiggerValue
    public static int biggerValue(int a, int b) {
        if (a >= b) {

            return a;
        } else {
            return b;
        }

    }

    //


    public static void main(String[] args) {

        printTaskNumberDolphin();

    }

}
