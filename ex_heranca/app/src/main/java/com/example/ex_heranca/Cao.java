package com.example.ex_heranca;

public class Cao extends Animal {

    void latir (){
        System.out.println("Au Au Au");
    }
    void correr(){
        super.correr();
        System.out.println("Cão");
    }

}
