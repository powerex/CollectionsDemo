package ua.edu.npu.annotations;

import java.lang.reflect.Method;

public class MarkerAnnotationDemo {

    @Marker
    public static void myMethod() throws NoSuchMethodException {
        MarkerAnnotationDemo demo = new MarkerAnnotationDemo();
        Method method = demo.getClass().getMethod("myMethod");
        if (method.isAnnotationPresent(Marker.class)) {
            System.out.println("Annotation Marker is present");
        }

    }

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
