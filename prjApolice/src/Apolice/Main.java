package Apolice;
    /**
     *
     * @author Miguel
     */
    public class Main {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            Apolice.agregado = 0.15f;


            Apolice apolice;

            apolice = new Apolice();
            //apolice.agregado = 0.15f; // péssima prática
            apolice.setNomeSegurado("Carlos da Silva");
            apolice.setValorPremio(1256.99f);
            apolice.setIdade(34);
            apolice.imprimir();


            Apolice apolice2 = new Apolice();
            apolice2.setNomeSegurado("Caio da Silva");
            apolice2.setValorPremio(1256.99f);
            apolice2.setIdade(23);
            apolice2.imprimir();



        }

    }
