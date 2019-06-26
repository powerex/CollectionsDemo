package ua.edu.npu.generics;

public class GenTwoParams<T extends Comparable<T> , V> {
    T key;
    V value;

    public GenTwoParams(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public void showInfo() {
        System.out.println(key);
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenTwoParams<String, Double> ss =
                new GenTwoParams<>("34", 3.);
        ss.showInfo();
    }
}
