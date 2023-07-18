package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
    public static void main(String[] args) {

        //Arreglos Arrays nace con tamaño fijo
        int[ ] numeros = new int[10];

        int numero = 40;


        //WRAPPERS
        //Integer numeroObjeto = new Integer(40); //deprecado
        Integer numeroObjeto = Integer.valueOf(40); //nuevo

        //Listas List nace con tamaño variable
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(numero);          //autoboxing
        //lista.add(new Integer(40)); //hace esto internamente
        lista.add(numeroObjeto);
        lista.add(Integer.valueOf(40));

        // undboxing
        int valorPrimitivo = numeroObjeto; //forma automatica
        int valorPrimitivo2 = numeroObjeto.intValue(); //forma manual

        double doubleInteger = numeroObjeto.doubleValue(); //8 bytes
        float floatInteger = numeroObjeto.floatValue(); //4 bytes
        long longInteger = numeroObjeto.longValue(); //8 bytes
        int intInteger = numeroObjeto.intValue(); //4 byte
        short shortInteger = numeroObjeto.shortValue(); //2 bytes
        byte byteInteger = numeroObjeto.byteValue(); //1 byte
        //char charInteger = numeroObjeto.charValue(); //2 bytes
        //boolean booleanInteger = numeroObjeto.booleanValue(); //1 byte

        System.out.println(Integer.MAX_VALUE);  //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.SIZE); //bits
        System.out.println(Integer.BYTES); //bytes

        System.out.println(lista);


        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

    }
}
