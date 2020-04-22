package thinking_in_java.chapter_14_information_of_types.example_4;

public class Initable2 {
    static int staticNonFinal = 2;
    static {
        System.out.println("Инициализация Initable2");
    }
}
