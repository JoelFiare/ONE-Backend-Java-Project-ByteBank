package project.bytebank;

public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(); //project.bytebank.Cuenta@3b9a45b3
        primeraCuenta.saldo = 200;

        Cuenta segundaCuenta = primeraCuenta; //el objeto hace referencia al espacio en memoria de primera cuenta
        segundaCuenta.saldo = 100;
        System.out.println("saldo primera cuenta: " + primeraCuenta.saldo);
        System.out.println("saldo segunda cuenta: " + segundaCuenta.saldo);

        segundaCuenta.saldo += 400;
        System.out.println("saldo primera cuenta: " + primeraCuenta.saldo);
        System.out.println("saldo segunda cuenta: " + segundaCuenta.saldo);

        System.out.println(primeraCuenta); //las 2 tienen el mismo id
        System.out.println(segundaCuenta);

        if (primeraCuenta == segundaCuenta) {
            System.out.println("son el mismo objeto");
        }
    }
}
