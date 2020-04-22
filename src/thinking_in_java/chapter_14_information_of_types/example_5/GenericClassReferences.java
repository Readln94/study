package thinking_in_java.chapter_14_information_of_types.example_5;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
//        genericIntClass = double.class; недопустимо
    }
}
