/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoComputadores;

import java.util.Scanner;

import static java.lang.System.*;

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
        Scanner sc = new Scanner(in);
        Computadores c  = new Computadores();
        System.out.println("Digite a marca do computador:  ");
        c.marca = sc.nextLine();
        System.out.println("Digite o modelo do computador: ");
        c.modelo = sc.nextLine();
        out.println("Digite a cor do computador: ");
        c.cor = sc.nextLine();
        out.println("Digite o numero de serie: ");
        c.numeroSerie = Long.parseLong(sc.nextLine());
        out.println("Digite o preco: ");
        c.preco = Double.parseDouble(sc.nextLine());
        c.imprimir();
        c.calcularValor();
        c.imprimir();
        Computadores d = new Computadores();
        out.println("Digite a marca do computador:  ");
        d.marca = sc.nextLine();
        out.println("Digite o modelo do computador: ");
        d.modelo = sc.nextLine();
        out.println("Digite a cor do computador: ");
        d.cor = sc.nextLine();
        out.println("Digite o numero de serie: ");
        d.numeroSerie = Long.parseLong(sc.nextLine());
        out.println("Digite o preco: ");
        d.preco = Double.parseDouble(sc.nextLine());
        d.imprimir();
        d.calcularValor();
        d.imprimir();
        if(d.alterarValor(1200.88)==1){
            out.println("Valor alterado com sucesso");
        }else{
            out.println("Valor não alterado");
        }
        d.imprimir();
    }

}