package udemy.example_31_regexp_part1;

public class Test {
    public static void main(String[] args) {
        /*
            \\d - одна цифра
            \\w - одна буква
            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символов до
            ( | | ) - одна строка из множества строк

            [abc] = (a|b|c) - эквивалентны

            [a-zA-Z] - все английские буквы

            [a-zA-Z] = \\w - эквивалентны

            [0-9] = \\d - эквивалентны

            [^abc] - мы хотим все символы кроме a, b, c
            [^a-z] - мы хотим все символы кроме маленьких английских букв

            . - любой символ

            {2} - 2 символа до
            {2, } - 2 или более символа
            {2, 4} - от 2 до 4
         */

        // ниже везде true
        System.out.println("-123".matches("-\\d*"));
        System.out.println("123".matches("-?\\d*"));
        System.out.println("+123".matches("(-|\\+)?\\d*"));
        System.out.println("abc123".matches("[a-zA-Z]+\\d+"));
        System.out.println("a13bc123".matches("[a-zA-Z31]+\\d+"));
        System.out.println("hello".matches("[^abc]*"));

        System.out.println("http://www.google.com".matches("https?://www.[a-zA-Z]+.(com|ru|net)"));
        System.out.println("http://www.rambler.net".matches("https?://www.[a-zA-Z]+.(com|ru|net)"));
        System.out.println("https://www.vk.ru".matches("https?://www\\..+\\.(com|ru|net)"));

        System.out.println("123".matches("\\d{3}"));
        System.out.println("123".matches("\\d{1,10}"));
    }
}
