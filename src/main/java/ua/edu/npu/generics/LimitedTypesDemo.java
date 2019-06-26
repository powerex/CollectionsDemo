package ua.edu.npu.generics;

public class LimitedTypesDemo {
    public static void main(String[] args) {
        Double[] array = {2.,3.,4.,5.,6.};
        GenLimitedTypes<Double> integerArray =
            new GenLimitedTypes<>(array);
        System.out.println(integerArray.getAverage());

//        String [] strings = {"  ", "dsfgd"};
//        GenLimitedTypes<String> stringArray =
//                new GenLimitedTypes<>(array);
//        System.out.println(integerArray.getAverage());


    }
}
