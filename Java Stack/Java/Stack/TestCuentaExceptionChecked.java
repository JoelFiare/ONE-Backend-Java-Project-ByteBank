package Java.Stack;

public class TestCuentaExceptionChecked {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        try {
            cuenta.deposita();
        } catch (MiException e) {
            System.out.println("exception atrapada.");
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
