package contaCorrente;

public class ContaCorrente {
    int conta;
    int agencia;
    double saldo;
    String nomeCliente;

    public int sacar(double valor){
        int ret = 0;
        if(valor <= this.saldo){
            this.saldo -= valor;
            ret = 1;
        }
        return ret;
    }

    public void depositar(double valor){
        System.out.println("Digite o valor que deseja depositar: ");
        this.saldo += valor;
        System.out.println("Seu novo saldo é de " + this.saldo);
    }

    public void imprimir(){
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("Número da agência: " + this.agencia);
        System.out.println("Número da conta: " + this.conta);
        System.out.println("Saldo atual: " + this.saldo);
    }
}
