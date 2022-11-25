package com.example.modificadores_de_acesso;

/* Modificadores de acesso
[1]Public: Todas as classes terão acesso;
[2]Private: Apenas pode ser acessado de dentro da classe;
[3]Protected: Pode ser acesado estando dentro do mesmo pacote e/ou subclasses
[4]Default: Caso não tenha sido definido nenhum modificador, permitindo o acesso dentro do pacote;
 */

public class Conta {
    private int numeroConta;
    private double saldo = 100;

    public double recuperarSaldo(){
        return this.saldo;
    }

    public void depositar (double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar (double valorSacar){
        this.saldo = this.saldo - valorSacar;
    }



}
