import java.util.Random;

public class Aluno {
    //Atributos da classe
    private int ra;
    private String nome;
    private String email;

    //métodos de acesso getters/setters
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Construtor padrão
    public Aluno(){
        Random r = new Random();
        ra = r.nextInt();
    }
    //Métodos da classe
    public void provarExistencia(){
        //Código do método
        System.out.println("Aluno Cadastrado");
        System.out.println("Ra do Aluno: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Seu email: " + email);
        System.out.println("");
    }


}