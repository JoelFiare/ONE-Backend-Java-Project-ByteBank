package project.bytebank;

//entidad cuenta
public class Cuenta {

        //atributos
        double saldo;
        int agencia;
        int numero;
        Cliente titular;

        //metodos que no retorna valor
        public void depositar(double valor){ //metodo void no retorna nada
                //esta cuenta = esta cuenta //this account = //this object =
                this.saldo += valor;
        }

        //metodo que retorna valor
        public boolean retirar(double valor){
                if (this.saldo >= valor){
                        this.saldo -= valor;
                        return true;
                }
                return false;
        }

        //metodo transferir
        public boolean transferir(double valor, Cuenta cuenta) {
                if (this.saldo >= valor){
                        this.retirar(valor);
                        cuenta.depositar(valor);
                        return true;
                }
                return false;
        }
}
