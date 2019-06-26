package ua.edu.npu.generics;

public class GenLimitedTypes<T extends Number> {

    private T[] array;

    public GenLimitedTypes(T[] array) {
        this.array = array;
    }

    public double getAverage() {
        double s = 0.0;
        for (T t: array) {
            s += t.doubleValue();
        }
        return s / array.length;
    }
}
