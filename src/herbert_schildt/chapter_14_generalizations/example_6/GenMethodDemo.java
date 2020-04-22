package herbert_schildt.chapter_14_generalizations.example_6;

public class GenMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};

        if(isIn(2, nums)) {
            System.out.println("Число 2 содержится в массиве nums");
        } else {
            System.out.println("Число 2 не содержится в массиве nums");
        }
        System.out.println();

        String[] strs = {"один", "два", "три", "четыре", "пять"};

        if(isIn("два", strs)) {
            System.out.println("Число \"два\" содержится в массиве strs");
        } else {
            System.out.println("Число \"два\" содержится в массиве strs");
        }
    }
}
