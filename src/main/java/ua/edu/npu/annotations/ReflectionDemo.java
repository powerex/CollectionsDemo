package ua.edu.npu.annotations;

import java.lang.reflect.Method;

public class ReflectionDemo {

    @Marker
    @RuntimeAnnotation(description = "Method", value = 42)
    public static void simpleMethod() {
        ReflectionDemo demo = new ReflectionDemo();

        try {
            Class<?> c = demo.getClass();
            Method method = c.getMethod("simpleMethod");
            RuntimeAnnotation annotation = method.getAnnotation(RuntimeAnnotation.class);
            System.out.println(annotation.description() + " " + annotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        simpleMethod();
    }

}
