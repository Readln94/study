package udemy.example_39_junit_part1;

public class MyMath {
    public static double divide(int number1, int number2) {
        if(number2 == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return number1 / number2;
    }
}
