package project.bytebank;

//entidad cuenta
public class Cuenta {

    //atributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente(); //cada vez q se cree un obj cuenta se crea un obj cliente

    //metodos que no retorna valor
    public void depositar(double valor) { //metodo void no retorna nada
        //esta cuenta = esta cuenta //this account = //this object =
        this.saldo += valor;
    }

    //metodo que retorna valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    //metodo transferir
    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
