package ua.edu.npu.generics;

public class Gen<T> {
    private T object;

    public Gen(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    void showTypeInfo() {
        System.out.println(object.getClass());
    }
}
