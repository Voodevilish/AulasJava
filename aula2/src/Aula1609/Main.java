package Aula1609; //array copy (System.arraycopy)

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     /*   int va[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int vb[] = new int[10];

        System.arraycopy(va, 3, vb, 6, 4);

        for (int item : vb) System.out.println(item);

        */

     boolean x[] = new boolean[10];
        Arrays.fill(x, true);

        for (boolean item : x) System.out.println(item);

        int vetor[] = {5, 1, 3, 8, 6};
        Arrays.sort(vetor);

        for(int item : vetor) System.out.println(item);

    }
}
