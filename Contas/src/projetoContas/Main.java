package projetoContas;

import java.util.Scanner;

public class Main {

    Contas cc = new Contas();

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Instanciar um objeto desta classe para invocar os métodos não estáticos
        Main principal = new Main();
        int opc = 0;
        while (opc != 9) {
            System.out.println("MENU");
            System.out.println("1 .. Cadastrar");
            System.out.println("2 .. Depositar");
            System.out.println("3 .. Sacar");
            System.out.println("4 .. Consultar");
            System.out.println("9 .. SAIR");
            System.out.println("Escolha a opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    principal.execCadastrar();
                    break;
                case 2:
                    principal.execDeposito();
                    break;
                case 3:
                    principal.execSaque();
                    break;
                case 4:
                    principal.execConsulta();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao inválida");
            }
        }
    }

    public void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Agencia: ");
        this.cc.agencia = sc.nextLine();
        System.out.println("Nome do Cliente: ");
        this.cc.nomeCliente = sc.nextLine();
        System.out.println("Conta numero: ");
        this.cc.conta = sc.nextLine();
        System.out.println("Conta Corrente cadastrada com sucesso");
    }

    public void execConsulta() {
        this.cc.imprimir();
    }

    public void execSaque() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        if (this.cc.sacar(valor) == 1) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não possui saldo");
        }

    }

    public void execDeposito() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        this.cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
    }

}