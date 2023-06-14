package project.bytebank;

public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("4562313");
        diego.setTelefono("4564564635");

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.setAgencia(1);
        cuentaDeDiego.setTitular(diego); //referencio al titular con el cliente

        System.out.println(cuentaDeDiego.getTitular().getNombre());
        System.out.println(diego.getNombre());
    }
}
