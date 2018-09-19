package matriz1309;

import java.util.Random;

public class Matriz1309 {
    public static void main(String[] args) {

        Random r = new Random();

        int matriz[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("[ " + matriz[i][j] + " ]");
            }
        }
        System.out.println("\n");
    }
}
