package com.bytebank;

public class TestReferencias {
    public static void main(String[] args) {

        //elemento mas generico puede ser adaptado al elemento mas especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        //funcionario.iniciarSesion("dsa");
        gerente.iniciarSesion("dsa");


    }
}
