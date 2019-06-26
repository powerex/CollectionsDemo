package ua.edu.npu.generics;

public class SimpleGenDemo {
    public static void main(String[] args) {
        Gen<String> stringGen = new Gen<>("Demo string");
        stringGen.showTypeInfo();
        System.out.println(stringGen.getObject());

        Gen<Integer> inetegerGen = new Gen<>(42);
        inetegerGen.showTypeInfo();
        System.out.println(inetegerGen.getObject());
    }
}
