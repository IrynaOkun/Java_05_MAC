import project_utils.Utils;
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

    /**
     * 8
     *
     */

    public static String insertQuotes (String text, String text2) {
        if (!text.isEmpty() && !text2.isEmpty()) {
            String textNew = text.replace("\",", ": ");
            String textNew2 = text2.replace("\" надо любить жизнь больше, чем смысл жизни\" ", "чем");

            return textNew.concat(textNew2).concat("\"");
        }

        return " ";
    }

    public static boolean isStringNotNullAndNotEmpty(String text) {
        if (text != null) {
            if (!text.trim().isEmpty()) {

            return true;
        }

    }

        return false;
}


    //11
    public boolean SameFirstLastLetterIndexOf(String str) {
        //сначала проверяем негативный сценарий
        if (str != null && !str.trim().isEmpty() && !str.trim().contains(" ")) {
            //далее проверяем позитивный сценарий
            str = str.trim().toLowerCase();//всегда сначала trim

            return str.lastIndexOf(str.charAt(0)) == (str.length() - 1);//найди последний индекс и сравни с послед индексом строки
            //взяли последн. индекс строки буквы и она же находится на последнем индексе
            //str.charAt(0) - первая буква слова
        }

        return false;
    }

    //Var2_хардкор

    public boolean compareFirstAndLastLetters(String word) {
        if (word == null) {
            return false;
        }
        if (word.isEmpty()) {
            return false;
        }

        word = word.trim();

        if (word.indexOf('A') == 0 && word.lastIndexOf('a') == word.length() -1) {

            return true;
        }

        return false;
    }

    //Var3__

    public String isWordStartEqualEnd (String inString) {
        if (!inString.isEmpty()) {
            inString = inString.toLowerCase();
            if (inString.indexOf(inString.charAt(0)) == inString.indexOf(inString.charAt(inString.length() - 1))) {

                return "True";
            }

            return "False";
        }

        return "Строка пустая";
    }

    //обязательно делаем trim и проверяем на null что стркоа !isEmpty

    //V4
    public String countAs (String inString) {
        if (!inString.isEmpty()) {
            int lengthStringWithoutAa = inString.trim().toLowerCase().replace("a", "").length();
            int countAaInString = inString.length() - lengthStringWithoutAa;

            return countAaInString + ", " + lengthStringWithoutAa;
        }

        return "Строка пустая";
    }




    public static void main(String[] args) {

        isStringNotNullAndNotEmpty("jkjkjkjkljkljkljlkj");
        System.out.println(isStringNotNullAndNotEmpty("jkhjhjhjkhkjhjkhjk"));

        System.out.println(insertQuotes("qwerty", "ghjkl"));;



    }

}

