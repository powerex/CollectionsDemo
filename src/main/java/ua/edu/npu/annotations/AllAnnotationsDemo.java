package ua.edu.npu.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Marker
@RuntimeAnnotation
public class AllAnnotationsDemo {

    @RuntimeAnnotation
    @SimpleAnnotation(description = "simple", value = 100)
    @SingeArgumentAnnotation(2.3)
    public static void method() {
        System.out.println("Inside method \" method()\"");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AllAnnotationsDemo demo = new AllAnnotationsDemo();

        Annotation annotation [] = demo.getClass().getAnnotations();
        System.out.println("Class annotations: ");
        for (Annotation a: annotation) {
            System.out.println(a);
        }
        System.out.println();

        Method method = demo.getClass().getMethod("method");
        annotation = method.getAnnotations();
        System.out.println("Method annotations: ");
        for (Annotation a: annotation) {
            System.out.println(a);
        }

    }

}
