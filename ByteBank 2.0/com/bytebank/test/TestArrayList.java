package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        // <> forzando que acepte un solo tipo de objeto
        //        generics
        ArrayList<Cuenta> lista = new ArrayList<>();
        Cuenta cc = new CuentaCorriente(11,22);
        Cuenta cc2 = new CuentaCorriente(13,42);
        Cuenta cc3 = new CuentaCorriente(13,42);

        lista.add(cc);
        lista.add(cc2);

        //Cliente cliente = new Cliente();
        //lista.add(cliente);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        //metodo .size retorna la cantidad de items dentro del arraylist

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //por cada cuenta en la lista
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        //comprobar si contiene
        boolean contiene = lista.contains(cc3);

        //comparando por referencia
        if (contiene) {
            System.out.println("SI es igual (equals)");
        }

        //comparando por valor
        /*if (cc.esIgual(cc3)){
            System.out.println("Son iguales");
        }*/
    }
}
