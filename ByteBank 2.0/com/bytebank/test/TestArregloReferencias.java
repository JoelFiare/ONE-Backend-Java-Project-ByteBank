package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(13,44);

        //                          [ new | cc |   |   |   ] //es una referencia al objeto, no estoy creando uno
        CuentaCorriente[] cuentas = new CuentaCorriente[5];
        cuentas[1] = cc;

        System.out.println(cc);
        System.out.println(cuentas[1]);

        cuentas[0] = new CuentaCorriente(11,99); // la creo y la referencio
        System.out.println(cuentas[0]);

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("posicion " + i + ": " + cuentas[i]);
        }


    }
}
