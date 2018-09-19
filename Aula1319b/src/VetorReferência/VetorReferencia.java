package VetorReferência;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class VetorReferencia {
    Cliente vet[] = new Cliente[10];
    int posicao = 0;

    public static void main(String[] args) {
        VetorReferencia vr = new VetorReferencia();
        Scanner sc = new Scanner(System.in);

        int opc = 9;

        do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Apresentar Todos");
            System.out.println("3 - Procurar");
            System.out.println("0 - Sair");
            opc = parseInt(sc.nextLine());

            switch (opc){
                case 1:
                    Cliente c  = new Cliente();
                    System.out.println("Digite o ID do cliente: ");
                    c.setId(parseInt(sc.nextLine()));
                    System.out.println("Digite o nome do cliente: ");
                    c.setNome(sc.nextLine());
                    vr.inserirCliente(c);
                    break;

                case 2:
                    vr.imprimirTodos();
                    break;

                case 3:
                    Cliente cp = new Cliente();
                    System.out.println("Digite o ID do cliente procurado: ");
                    cp.setId(Integer.parseInt(sc.nextLine()));
                    vr.encontrarCliente(cp);
                    break;

                case 0:
                    System.out.println("FIM");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public String inserirCliente(Cliente c) {
        vet[posicao++] = c;
        return "Cliente cadastrado com sucesso\n";
    }

    public void imprimirTodos() {
        for (Cliente cliente : vet) {
            if (cliente != null) {
                System.out.println(cliente.dadosCliente());
            }
        }
    }

    public void encontrarCliente(Cliente c) {
        for (Cliente cliente : vet) {
            if (cliente != null) {
                if (cliente.getId() == c.getId()) {
                    System.out.println(cliente.dadosCliente());
                }
            }
        }
    }
}
