package com.bytebank;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();

        diego.setNombre("diego");
        diego.setDocumento("45646546");
        diego.setSalario(2000d);

        System.out.println(diego.getSalario());
    }
}
