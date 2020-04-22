package thinking_in_java.chapter_14_information_of_types.example_4;

public class Initable {
    static final int staticFinal = 1;
    static final int staticFinal2 = ClassInitialisation.rand.nextInt(1000);
    static {
        System.out.println("Инициализация Initable");
    }
}
