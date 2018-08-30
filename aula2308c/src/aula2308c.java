import java.io.IOException;

public class aula2308c {


    public static void main(String[] args) throws IOException {
        int x[] = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = i;
        }
        for (int valor : x) {
            System.out.println(valor);
        }

        int l;
        System.out.println("Digite f para terminar");
        while(true){
            l = System.in.read();
            System.out.println(l);
            if((char)l == 'f'){
                break;
            }
        }
        System.out.println("Acabou o laço");

    }

}