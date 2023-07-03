package com.bytebank;

public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.deposita(210);
        try {
            cuenta.saca(210);
            cuenta.saca(10);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }
    }
}
