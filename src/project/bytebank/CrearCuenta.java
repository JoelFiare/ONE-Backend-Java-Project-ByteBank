package project.bytebank;

public class CrearCuenta {
    public static void main(String[] args) {

        //variable           = valor
        //variable          -> project.bytebank.Cuenta@eed1f14
        //la variable es la referencia a ese espacio en la memoria con el id
        Cuenta primeraCuenta = new Cuenta();  //cada objeto creado tiene un id
        primeraCuenta.saldo = 400;
        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta(); //cuando creo un objeto java lo inicializa con valores por defectos
        segundaCuenta.saldo = 400;
        System.out.println(primeraCuenta.saldo); //double como 0.00
        System.out.println(primeraCuenta.agencia); //int como 0
        System.out.println(primeraCuenta.numero);
        System.out.println(primeraCuenta.titular); //string como null

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if (primeraCuenta == segundaCuenta) { //compara si son distintos objetos en memoria
            System.out.println("son el mismo objeto");
        } else {
            System.out.println("son diferentes");
        }

    }
}
