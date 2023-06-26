package com.bytebank;

public class EnumDias {
    public static void main(String[] args) {
        for (Enum dia : Enum.values()){
            System.out.println("El dia de la semana es: " + dia);
        }

        Enum domingo = Enum.DOMINGO;

        System.out.println(domingo.name()); //nombre
        System.out.println(domingo.ordinal()); //posicion
        System.out.println(domingo.toString()); //lo pasa a string

    }
}
