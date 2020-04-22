package herbert_schildt.chapter_14_generalizations.example_1;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(5);
        Gen<Integer> iOb2 = new Gen<>(5);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Тест обобщений");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}
