package thinking_in_java.chapter_14_information_of_types.example_4;

import java.util.Random;

public class ClassInitialisation {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("После создания ссылки Initable");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("thinking_in_java.chapter_14_information_of_types.example_4.Initable3");
        System.out.println("После создания ссылки на Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}
