package udemy.example_13_interface_comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

    private static void addElements(Collection collections) {
        collections.add(new Person(2, "Tom"));
        collections.add(new Person(3, "Katy"));
        collections.add(new Person(4, "George"));
        collections.add(new Person(1, "Bob"));
    }
}
