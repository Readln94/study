package herbert_schildt.chapter_14_generalizations.example_5;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if(average() == ob.average()) {
            return true;
        } else {
            return false;
        }
    }
}
