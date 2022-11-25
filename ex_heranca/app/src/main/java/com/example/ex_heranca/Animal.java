package com.example.ex_heranca;

public class Animal {

    int tamanho;
    String cor;
    double peso;

    //Getter and Setter


    void setCor (String cor){
        this.cor = cor;
    }
    String getCor(){
        return this.cor;
    }

    void dormir(){
        System.out.println("Dormir como um ");
    }
    void correr(){
        System.out.println("Correr como um ");
    }
}
