package contaCorrente;

import java.util.Scanner;

public class PrincipalContaCorrente {
    public static int TAM = 3;
    int indice;
    ContaCorrente[] cc = new ContaCorrente[TAM];

    public static void main(String[] args) {
        PrincipalContaCorrente obj = new PrincipalContaCorrente();
        Scanner sc = new Scanner(System.in);

        int opcMenu = 0;

        while (opcMenu != 9){
            System.out.println("Dados de 3 contas: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Consultar");
            System.out.println("9 - Sair");
            System.out.println("Selecione sua opção:");
            opcMenu = sc.nextInt();

            switch (opcMenu){
                case 1:
                    obj.execCadastro();
                    break;

                case 2:
                    obj.execSaque();
                    break;

                case 3:
                    obj.execDeposito();
                    break;

                case 4:
                    obj.execConsulta();
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public void execCadastro(){
        if (indice >= TAM) {
            System.out.println("Todos os espaços foram preenchidos.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        this.cc[indice] = new ContaCorrente();
        System.out.println("Digite o seu nome: ");
        this.cc[indice].nomeCliente = sc.nextLine();
        System.out.println("Digite o número da conta: ");
        this.cc[indice].conta = sc.nextInt();
        System.out.println("Digite o número da agência: ");
        this.cc[indice].agencia = sc.nextInt();
        System.out.println("Digite o saldo atual: ");
        this.cc[indice].saldo = sc.nextDouble();
        indice++;
    }

    public void execConsulta(){
        if (indice > 0){
            System.out.println("Digite o número da posição [0, 1, 2]:");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();

            if ((op < 0) || (op > 2)){
                System.out.println("Posição inválida, tente novamente");
            } else {
                this.cc[op].imprimir();
            }
        } else {
            System.out.println("Nenhuma conta cadastrada.");
        }
    }

    public void execSaque(){
        if (indice > 0) {
            System.out.println("Digite o número da posição [0, 1, 2]: ");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();

            if (op > indice){
                System.out.println("Posição inválida, tente novamente.");
            } else {
                System.out.println("Digite o valor do saque: ");
                double valor = sc.nextDouble();
                int ret = this.cc[op].sacar(valor);

                if (ret == 0){
                    System.out.println("Saque não realizado.");
                } else {
                    System.out.println("Saque realizado com sucesso.");
                }
            }
        } else {
            System.out.println("Nenhuma conta cadastrada.");
        }
    }

    public void execDeposito(){
        if (indice > 0) {
            System.out.println("Digite o número da posição [0, 1, 2]: ");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();

            if (op > indice) {
                System.out.println("Posição inválida, tente novamente");
            } else {
                System.out.println("Digite o valor a ser depositado: ");
                double valor = sc.nextDouble();
                this.cc[op].depositar(valor);
                System.out.println("Depósito realizado com sucesso.");
            }
        } else {
            System.out.println("Nenhuma conta cadastrada.");
        }
    }
}
