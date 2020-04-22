package herbert_schildt.chapter_14_generalizations.example_5;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer iNums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(iNums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb = " + v);

        Double dNums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dNums);
        double w = dOb.average();
        System.out.println("Среднее значение dOb = " + w);

        Float fNums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<>(fNums);
        double x = fOb.average();
        System.out.println("Среднее значение fOb = " + x);

        System.out.print("Средния значения  iOb и dOb ");
        if(iOb.sameAvg(dOb)) {
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }

        System.out.print("Средния значения  iOb и fOb ");
        if(iOb.sameAvg(fOb)) {
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }

        System.out.print("Средния значения  dOb и fOb ");
        if(dOb.sameAvg(fOb)) {
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }
    }
}
