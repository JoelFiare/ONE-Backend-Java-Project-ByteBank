package project.bytebank;

public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(1);
        Cliente clienteDiego = new Cliente();
        //Cliente cliente = new Cliente();

        //cuentaDeDiego.titular = cliente;
        //cuentaDeDiego.titular = new Cliente(); //referenciamos

        //System.out.println(cuentaDeDiego.titular.nombre = "Diego");

        Cuenta maria = new Cuenta(1);
        //System.out.println(maria.getTitular().setNombre("maria"));
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
}
