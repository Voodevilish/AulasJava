package Apolice;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;
    public static float agregado;



    public String getNomeSegurado(){
        return nomeSegurado;
    }
    public void setNomeSegurado(String nomeSegurado){
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }


    /**
     *
     * Todos os dados da apólice.
     * Método imprimir - atende ao requisito......
     */
    public String imprimir(){
        String dados = "Dados da apólice..";
        System.out.println("Dados da Apólice");
        System.out.println("Nome: " + nomeSegurado);
        System.out.println("Valor do Premio: " + valorPremio);
        System.out.println("Idade: " + idade);
        System.out.println("Valor Aumentado no Premio: " + agregado);
        System.out.println("");
        return dados;
    }
}

