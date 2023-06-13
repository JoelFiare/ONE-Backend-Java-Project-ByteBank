package project.bytebank;

public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "4562313";
        diego.telefono = "4564564635";

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.agencia = 1;
        cuentaDeDiego.titular = diego; //referencio al titular con el cliente

        System.out.println(cuentaDeDiego.titular.nombre);
        System.out.println(diego.nombre);
    }
}
