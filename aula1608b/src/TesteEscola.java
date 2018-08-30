public class TesteEscola {


    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setRa(27);
        aluno1.setNome("Juca");
        aluno1.setEmail("juca@fatec.com");

        aluno2.setRa(33);
        aluno2.setNome("Maria");
        aluno2.setEmail("mmmm@mmm.com");

        aluno1.provarExistencia();
        aluno2.provarExistencia();
    }

}