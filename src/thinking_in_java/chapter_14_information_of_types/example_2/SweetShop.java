package thinking_in_java.chapter_14_information_of_types.example_2;

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("В методе main");
        new Candy();
        System.out.println("После создания Candy");
        try {
            Class.forName("thinking_in_java.chapter_14_information_of_types.example_2.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Не удалось найти Gum");
        }
        System.out.println("После вызова метода Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("После создаия объекта Cookie");
    }
}
