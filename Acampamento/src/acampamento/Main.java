package acampamento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome: ");
        membro.setNome(sc.nextLine());
        System.out.println("Digite a idade: ");
        membro.setIdade(Integer.parseInt(sc.nextLine()));
        System.out.println(membro.toString());
        membro.separarGrupo();
        System.out.println(membro.toString());
        JOptionPane.showMessageDialog(null, membro.toString());


    }

}