package project.bytebank;

public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        Cliente cliente = new Cliente();

        cliente.setNombre("Diego");
        cliente.setDocumento("fasdsafq2123");
        cuenta.setTitular(cliente);
        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
        System.out.println(cuenta.getTitular());

        Cliente titular = cuenta.getTitular();
        System.out.println(titular);
        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
    }
}
