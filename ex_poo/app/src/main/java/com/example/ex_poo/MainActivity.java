package com.example.ex_poo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Casa minhaCasa = new Casa();
        minhaCasa.cor = "Azul";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();*/

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "joao";
        funcionario.salario = 920;

        //funcionario.recuperarSalario();
        double salarioRecuperado = funcionario.recuperarSalario(150, 20);
        System.out.println("O salario do Joao e: " + salarioRecuperado);

        funcionario.qualNome();

    }
}