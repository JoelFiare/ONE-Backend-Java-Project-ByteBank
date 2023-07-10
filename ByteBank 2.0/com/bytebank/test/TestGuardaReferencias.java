package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;

public class TestGuardaReferencias {
    public static void main(String[] args) {
        GuardaCuentas guardaCuentas = new GuardaCuentas();

        CuentaCorriente cc1 = new CuentaCorriente(23,25);
        guardaCuentas.adicionar(cc1);
        System.out.println(guardaCuentas.obtener(0));
    }
}
