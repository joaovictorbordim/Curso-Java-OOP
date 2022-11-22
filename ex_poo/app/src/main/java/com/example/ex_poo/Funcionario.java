package com.example.ex_poo;

public class Funcionario {
    //propriedades
    String nome;
    double salario;



    //metodos
    //void - sem retorno execultando apenas oque está dentro das {}
    //void recuperarSalario () {

    //com retorno
    double recuperarSalario (double bonus, double descontoAdicional) {
        this.salario = this.salario - (this.salario * 0.1); //calculo de desconto no salario
        return this.salario + bonus - descontoAdicional;
        //System.out.println(this.salario); //this chama métodos ou propriedade da mesma class.
    }
    void qualNome(){
        System.out.println(this.nome);
    }
}
