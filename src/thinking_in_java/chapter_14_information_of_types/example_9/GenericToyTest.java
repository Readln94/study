package thinking_in_java.chapter_14_information_of_types.example_9;

import thinking_in_java.chapter_14_information_of_types.example_3.FancyToy;

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        //Не компилируется
        //Class<Toy> up2 = ftClass.getSuperclass();
        //Создает только Object:
        Object obj = up.newInstance();
    }
}
