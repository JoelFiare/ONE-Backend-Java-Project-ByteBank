package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias2 {
    public static void main(String[] args) {

        //                    [ new | cc |   |   |   ] //es una referencia al objeto, no estoy creando uno
        Object[] referencias = new Object[5];
        
        CuentaCorriente cc = new CuentaCorriente(13,44);

        referencias[1] = cc;

        Cliente cliente = new Cliente();
        referencias[4] = cliente;

        Cliente obtenido = (Cliente) referencias[4];
        System.out.println(obtenido);

        CuentaAhorros ca = new CuentaAhorros(44,55);
        referencias[3] = ca;

        //cast
        CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
        System.out.println(cuenta);


        System.out.println(cc);
        System.out.println(referencias[1]);

        referencias[0] = new CuentaCorriente(11,99); // la creo y la referencio
        System.out.println(referencias[0]);

        for (int i = 0; i < referencias.length; i++) {
            System.out.println("posicion " + i + ": " + referencias[i]);
        }


    }
}
