package udemy.example_31_regexp_part2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "Hello12312321312there12312421412412hey";

        String words[] = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String a1 = a.replaceAll("\\d+", " ");
        String a2 = a.replaceFirst("\\d+", " ");

        System.out.println(a1);
        System.out.println(a2);
    }
}
