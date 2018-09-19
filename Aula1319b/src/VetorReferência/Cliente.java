package VetorReferência;

public class Cliente {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String dadosCliente() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do cliente: \n");
        sb.append("ID do cliente: ") .append(id) .append("\n");
        sb.append("Nome do cliente: ") .append(nome) .append("\n\n");
        return sb.toString();
    }
}
