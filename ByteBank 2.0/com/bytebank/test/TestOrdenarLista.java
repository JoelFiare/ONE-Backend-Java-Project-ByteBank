package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLista {
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

        // Ordenar las cuentas
        // Cualquier clase que extienda de Cuenta
        // Comparator <? extend Cuenta> c

        // POR NOMBRE DE CUENTA
        //Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
        //lista.sort(comparator);
        lista.sort(new OrdenadorPorNumeroCuenta());

        System.out.println("Despues de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        // POR TITULAR
        //Comparator<Cuenta> comparator2 = new OrdenadoPorTitular();
        //lista.sort(comparator2);
        lista.sort(new OrdenadoPorTitular());

        System.out.println("Despues de ordenar por titular");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        // METODO ANTIGUO DE ORDENAR
        System.out.println("Despues de ordenar por orden natural");
        //Collections.sort(lista, new OrdenadoPorTitular());

        Collections.sort(lista);
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }

}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta cuenta1, Cuenta cuenta2) {
        //forma basica
        /*if (cuenta1.getNumero() == cuenta2.getNumero()) {
            return 0;
        } else if (cuenta1.getNumero() > cuenta2.getNumero()) {
            return 1;
        } else {
            return -1;
        }*/
        //forma intermedia
        //return cuenta1.getNumero() - cuenta2.getNumero();

        //forma wrapper
        return Integer.compare(cuenta1.getNumero(), cuenta2.getNumero());
    }
}

class OrdenadoPorTitular implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta cuenta1, Cuenta cuenta2) {
        return cuenta1.getTitular().getNombre().compareTo(cuenta2.getTitular().getNombre());
    }
}

