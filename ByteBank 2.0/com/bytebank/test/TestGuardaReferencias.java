package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaReferencias;

public class TestGuardaReferencias {
    public static void main(String[] args) {
        GuardaReferencias guardaReferencias = new GuardaReferencias();

        Cuenta cc1 = new CuentaCorriente(23,25);
        guardaReferencias.adicionar(cc1);
        Cuenta cc2 = new CuentaCorriente(45,85);
        guardaReferencias.adicionar(cc2);
        System.out.println(guardaReferencias.obtener(0));
        System.out.println(guardaReferencias.obtener(1));
    }
}
