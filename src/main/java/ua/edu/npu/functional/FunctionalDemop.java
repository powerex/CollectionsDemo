package ua.edu.npu.functional;

public class FunctionalDemop {
    public static void main(String[] args) {
        InterfaceF call = () -> {return "Hello" + " 3";};
        System.out.println(call.getHello());

        int y = 6;
        FunsWithOneParam ob = (x) -> x*2;
        System.out.println(ob.calc(y));
        System.out.println(ob.calc(10));
        System.out.println(ob.calc(100));

        System.out.println("+++++++++++++++++++++++++++++");
        ob = (x) -> { return x*3;};
        System.out.println(ob.calc(y));
        System.out.println(ob.calc(10));
        System.out.println(ob.calc(100));
    }
}
