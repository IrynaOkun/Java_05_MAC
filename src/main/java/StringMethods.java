public class StringMethods {

    /**
     * Task_1
     * Написать метод removeSpaces(), который принимает на вход строку.
     * Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и
     * в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
     * Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     *
     * Task_2
     * Написать алгоритм removeAllAs().
     * С помощью методов из видео1,  написать алгоритм,
     * который принимает на вход строку. Если строка валидная,
     * то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     *  “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     *
     */



    //Task_1
    public String removeSpaces(String first) {

        if (first != null && !first.isEmpty() && first.trim().length() > 0) {

            if (first.trim().equals(first)) {

                return "Пробелов не было";
            } else {

                return "Лишние пробелы удалены";
            }

        } return "Строка пустая";

    }


    //Task_2

    public String removeAlleAs(String second) {

        if (second != null && !second.isEmpty() && second.trim().equals(second)) {

            second = second.replace("a", "").trim();
        } else {

            return second.replace("a", "").trim();
        }

        return second;
    }

    /**
     * Task_3
     * Написать алгоритм removeAllZeros().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей,
     * метод возвращает сообщение “This is a valid string”.
     * Test Data:
     *  “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */

    public String removeAllZeros(String third) {
        if (third != null && !third.isEmpty()) {
            third.replaceAll("0", "").trim();

        }

        return third;
    }

}
