package udemy.example_42_annotation_part2;

public class Test {
    @MethodInfo(author = "Slava", purpose = "Print hello world!")
    public void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
