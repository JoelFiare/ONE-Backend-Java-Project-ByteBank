package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
    public static void main(String[] args) {

        //Arreglos Arrays nace con tamaño fijo
        int[ ] numeros = new int[10];

        int numero = 40;
        Integer numeroObjeto = new Integer(40);

        //Listas List nace con tamaño variable
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(numero);          //autoboxing
        //lista.add(new Integer(40)); //hace esto internamente
        lista.add(numeroObjeto);

        System.out.println(lista);

    }
}
