public class aula2308a {

    public static void main(String[] args) {
        //passar de String para double
        String strX = "123";
        double x = Double.parseDouble(strX);
        System.out.println(x + 10.99);

        //passar de double para String
        double a = 20.0;
        int b = 5;
        String strA = Double.toString(a);
        String strB = String.valueOf(b);
        String juncao = strA + " - " + strB;
        System.out.println(juncao);

        //Exemplo de cast
        float media = 9.0f / 2;
        System.out.println("Media: " + media);
        a *= a > 10 ? 0.95 : 0.98;

        System.out.println("Valor de A: " + a);

    }

}