package com.bytebank.test;

public class TestMain {
    public static void main(String[] args) {

        /*
        //muestra los argumentos que se le puede enviar a la clase main
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }*/

        int edad = 20;
        int edad2 = 15;
        int edad3 = 67;

        //quiero agruparlas en una sola referencia u objeto
        //todos inician en cero

        //indices    0   1   2   3   4
        //         [   |   | 30  |   |   ]
        int[] edades = new int[5];

        edades[2] = 30;

        System.out.println(edades[2]);
        System.out.println(edades[0]);

        System.out.println(edades.length);
        int tamanoArray = edades.length;
        System.out.println(tamanoArray);

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }

    }
}
