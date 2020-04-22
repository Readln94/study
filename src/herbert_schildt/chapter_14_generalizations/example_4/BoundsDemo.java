package herbert_schildt.chapter_14_generalizations.example_4;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer iNums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(iNums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb = " + v);

        Double dNums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dNums);
        double x = dOb.average();
        System.out.println("Среднее значение dOb = " + x);
    }
}
