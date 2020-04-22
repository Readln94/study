package thinking_in_java.chapter_14_information_of_types.example_3;

import java.lang.reflect.Field;

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Имя класса : " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноническое имя: " + cc.getCanonicalName());
        System.out.print("Список полей: [");
        for (Field f : cc.getDeclaredFields()) {
            System.out.print(f.getName() + ", ");
        }
        System.out.println("]");
        System.out.println();
    }

    static void recurs(Object o) {
        System.out.println(o.getClass().getSimpleName());
        try {
            recurs(o.getClass().getSuperclass().newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {}
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("thinking_in_java.chapter_14_information_of_types.example_3.FancyToy");
        } catch (ClassNotFoundException exc) {
            System.out.println("Не удается найти FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for(Class face : c.getInterfaces())
            printInfo(face);

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException exc) {
            System.out.println("Не удалось создать экземпляр");
        } catch (IllegalAccessException exc) {
            System.out.println("Откзанно в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());

        recurs(new FancyToy());
    }
}
