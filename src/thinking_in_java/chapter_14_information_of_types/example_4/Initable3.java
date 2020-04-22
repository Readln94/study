package thinking_in_java.chapter_14_information_of_types.example_4;

public class Initable3 {
    static int staticNonFinal = 3;
    static {
        System.out.println("Инициализация Initable3");
    }
}
