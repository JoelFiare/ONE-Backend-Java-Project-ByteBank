package project.bytebank;

public class CrearCuenta {
    public static void main(String[] args) {

        //variable           = valor
        //variable          -> project.bytebank.Cuenta@eed1f14
        //la variable es la referencia a ese espacio en la memoria con el id
        Cuenta primeraCuenta = new Cuenta(1);  //cada objeto creado tiene un id
        primeraCuenta.depositar(400);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(1); //cuando creo un objeto java lo inicializa con valores por defectos
        segundaCuenta.depositar(400);
        System.out.println(primeraCuenta.getSaldo()); //double como 0.00
        System.out.println(primeraCuenta.getAgencia()); //int como 0
        System.out.println(primeraCuenta.getNumero());
        System.out.println(primeraCuenta.getTitular()); //string como null

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if (primeraCuenta == segundaCuenta) { //compara si son distintos objetos en memoria
            System.out.println("son el mismo objeto");
        } else {
            System.out.println("son diferentes");
        }

    }
}
