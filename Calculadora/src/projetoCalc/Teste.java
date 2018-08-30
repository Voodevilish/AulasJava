package projetoCalc;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        //Depende da entrada do usuário
        Calcular calcular = new Calcular();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        calcular.setNum1(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o valor 2: ");
        calcular.setNum2(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite 1 para soma, ou 2 para subtracao: ");
        calcular.setOperador(Integer.parseInt(sc.nextLine()));
        if (calcular.getOperador() == 1) {
            System.out.println("Soma é: " + calcular.somar());
        } else {
            System.out.println("Subtracao = " + calcular.subtrair());
        }

    }

}