package com.bytebank.test;

public class TestWrappers {
    public static void main(String[] args) {
        Double numeroDoble = 33.0; //autoboxing
        Boolean verdadero = true; //autoboxing

        Double numeroDoble2 = Double.valueOf(33.0); //autoboxing

        System.out.println(numeroDoble2);

        String numeroString = "43"; //autoboxing                Forma 1
        String numeroString2 = new String("43"); //autoboxing   Forma 2

        Double stringToDouble = Double.valueOf(numeroString); //autoboxing
        Integer stringToInteger = Integer.valueOf(numeroString); //autoboxing

        System.out.println(stringToDouble);
        System.out.println(stringToInteger);

        Number numero = Integer.valueOf(5); //autoboxing
        System.out.println(numero);
        double numeroDoublePrimitivo = numero.doubleValue(); //unboxing
        System.out.println(numeroDoublePrimitivo);

        Boolean falso = Boolean.FALSE; //autoboxing
        Boolean falso2 = false; //autoboxing

    }
}
