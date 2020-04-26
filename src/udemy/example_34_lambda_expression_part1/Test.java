package udemy.example_34_lambda_expression_part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        Runner runner = new Runner();
//        final int a = 5;
//        runner.run(x -> x + 5 + a);
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("ab");

        list.sort((o1, o2) -> {
            if(o1.length() > o2.length()) {
                return 1;
            } else if(o1.length() < o2.length()) {
                return -1;
            } else return 0;
        });

        Comparator<String> comparator = (o1, o2) -> {
            if(o1.length() > o2.length()) {
                return 1;
            } else if(o1.length() < o2.length()) {
                return -1;
            } else return 0;
        };

        System.out.println(list);
    }
}
