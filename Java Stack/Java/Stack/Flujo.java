package Java.Stack;

import java.util.Arrays;

public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio del main");
        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin del main");
    }

    private static void metodo1() throws MiException {
        System.out.println("Inicio del metodo1");
        metodo2();
        System.out.println("Fin del metodo1");
    }

    private static void metodo2() throws MiException {// avisa en la firma del metodo que va a lanzar mi exception
        System.out.println("Inicio del metodo2");
        throw new MiException("mi excepcion fue lanzada");
    }

}