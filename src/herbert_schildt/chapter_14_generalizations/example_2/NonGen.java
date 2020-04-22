package herbert_schildt.chapter_14_generalizations.example_2;

public class NonGen {
    Object ob;

    public NonGen(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Объект относится к типу " + ob.getClass().getName());
    }
}
