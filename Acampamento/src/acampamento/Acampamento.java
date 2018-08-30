package acampamento;

public class Acampamento {

    //Atributos
    private String nome;
    private char equipe;
    private int idade;

    //Acessadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    //Métodos

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder();
        str.append("Nome do Membro: ").append(nome).append("\n");
        str.append("Idade: ").append(idade).append("\n");
        str.append("Equipe: ").append(equipe).append("\n");
        return str.toString();
    }



    public void imprimir(){
        System.out.println("Nome do Membro: " + getNome());
        System.out.println("Idade do(a) " + getNome() + " = "
                + getIdade() + " anos");
        System.out.println("Equipe: " + getEquipe());
        System.out.println("");
    }
    public void separarGrupo(){
        //Lógica para responder o cenario vai aqui...
        if(getIdade() <= 5){
            setEquipe(' ');
            return;
        }
        if(getIdade()<=10){
            setEquipe('A');
            return;
        }
        if(getIdade()<=20){
            setEquipe('B');
            return;
        }
        setEquipe('C');
    }
}