package projetoContas;

public class Contas {
    String conta;
    double saldo;
    String agencia;
    String nomeCliente;

    public int sacar(double valor){
        if(saldo >= valor){
            saldo-= valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor){
        saldo+= valor;
    }

    public void imprimir(){
        System.out.println("Conta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo da Conta: " + saldo);
    }

}