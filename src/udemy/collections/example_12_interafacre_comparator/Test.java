package udemy.collections.example_12_interafacre_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("abcdefg");
        animals.add("cat");
        animals.add("ab");
        animals.add("frog");
        animals.add("bird");
        animals.add("b");
        animals.add("a");
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);
        Collections.sort(numbers, (o1, o2) -> {
            if(o1 > o2) {
                return -1;
            } else if (o1 < o2) {
                return 1;
            }
            return 0;
        });
        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Mike"));
        people.add(new Person(1, "Bob"));
        people.add(new Person(2, "Katy"));

        Collections.sort(people, ((o1, o2) -> {
            if(o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() < o2.getId()) {
                return -1;
            }
            return 0;
        }));

        System.out.println(people);
    }
}
