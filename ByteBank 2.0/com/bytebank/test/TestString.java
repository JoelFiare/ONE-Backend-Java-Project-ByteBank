package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String nombre = "Alura"; //todo string por naturaleza es inmutable
        //forma no utilizada en el mundo real
        // String nombre2 = new String("Alura");
        System.out.println("Antes: " + nombre);

        nombre = nombre.replace("A","a");
        System.out.println("Despues: " + nombre);

        nombre = nombre.concat(" Cursos Online");
        System.out.println("Despues: " + nombre);

        nombre = nombre.toUpperCase(Locale.ROOT);
        System.out.println(nombre);

        nombre = nombre.toLowerCase();
        System.out.println(nombre);

        char letra = nombre.charAt(3);
        System.out.println(letra);

        int indice = nombre.indexOf("e");
        System.out.println(indice);

        printLine("dsads");
        printLine(nombre);
        printLine(letra);
        printLine(indice);
        printLine(new CuentaAhorros(200, 300));

        //Object es la raiz de java
        Object c = new CuentaAhorros(344, 544);
        printLine(c);
        }

        //creo mi propio printLn con object llamo a todos los objetos y no tengo q sobrecargar
        public static void printLine (Object valor){
            System.out.println(valor.toString());
    }
}
