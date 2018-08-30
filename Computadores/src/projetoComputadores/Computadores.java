/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoComputadores;

/**
 *
 * @author Miguel
 */
public class Computadores {
    String marca;
    String cor;
    String modelo;
    long numeroSerie;
    double preco;

    public void imprimir(){
        System.out.println("Dados do Computador");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Num. Serie: " + numeroSerie);
        System.out.println("Preco: " + preco);
        System.out.println("--------------------------");
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.3;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.5;
        }
    }
    public int alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return 1;
        }
        return 0;
    }

}