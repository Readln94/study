package herbert_schildt.chapter_14_generalizations.example_3;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Значение " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение " + str);
    }
}
