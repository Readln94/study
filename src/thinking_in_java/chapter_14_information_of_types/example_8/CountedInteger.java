package thinking_in_java.chapter_14_information_of_types.example_8;

public class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}
