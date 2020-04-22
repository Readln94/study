package herbert_schildt.chapter_14_generalizations.example_4;

public class Stats<T extends Number> {
    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].intValue();
        }
        return sum / nums.length;
    }
}
