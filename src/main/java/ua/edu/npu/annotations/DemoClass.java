package ua.edu.npu.annotations;

@SimpleAnnotation(description = "Dec", value = 100)
public class DemoClass {

    public static void main(String[] args) {

    }

    @SimpleAnnotation(description = "Hello text", value = 1)
    public static String getText() {
        return "Hello";
    }

}
