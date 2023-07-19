package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(62, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Cuenta ca2 = new CuentaAhorros(32, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        ca2.setTitular(clienteCC2);
        ca2.deposita(444.0);

        Cuenta cc3 = new CuentaCorriente(2, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Cuenta ca4 = new CuentaAhorros(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        ca4.setTitular(clienteCC4);
        ca4.deposita(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(ca2);
        lista.add(cc3);
        lista.add(ca4);

        System.out.println("Antes de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        lista.sort(new OrdenadorPorNumeroCuenta());

        System.out.println("Despues de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        lista.sort(new OrdenadoPorTitular());

        // Usando Lambdas
        //no va el return por que no tiene {} ya lo define el compare que retorna un int
        lista.sort((Cuenta o1, Cuenta o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));

        //forma anterior
        /*lista.sort(new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return Integer.compare(o1.getNumero(), o2.getNumero());
            }
        });*/

        System.out.println("todo en uno");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        System.out.println("Despues de ordenar por titular");
        /*for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }*/
        // FOR each con lambda
        lista.forEach(cuenta -> System.out.println(cuenta));

        System.out.println("Despues de ordenar por orden natural");

        //otra forma de Lambda
        Collections.sort(lista, (c1, c2) -> c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre()));

        Collections.sort(lista);
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
}
