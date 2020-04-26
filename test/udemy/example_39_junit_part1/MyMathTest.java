package udemy.example_39_junit_part1;

import org.junit.Test;
import udemy.example_39_junit_part1.MyMath;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        MyMath.divide(1, 0);
    }
}
