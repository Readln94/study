package herbert_schildt.chapter_14_generalizations.example_7_interfaces;

interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
