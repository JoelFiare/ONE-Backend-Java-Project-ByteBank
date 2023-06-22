package project.bytebank;

public class PruebaConstructor {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(555);
        Cuenta cuenta2 = new Cuenta(333);
        //cuenta.setAgencia(-4);
        //System.out.println(cuenta.getAgencia());
        System.out.println(Cuenta.getTotal());

    }
}
