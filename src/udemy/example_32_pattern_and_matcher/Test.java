package udemy.example_32_pattern_and_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "Hello, guys! I send you email writeln94@yandex.ru so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. I am sending you\n" +
                "my address: Aristoos94@gmail.com. Let's stay in touch...";

        Pattern email = Pattern.compile("[^ ]+@(yandex|gmail)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
