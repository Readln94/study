package herbert_schildt.chapter_14_generalizations.example_1;

public class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}
