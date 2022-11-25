package com.example.modificadores_de_acesso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Conta conta = new Conta();
        conta.depositar(1000);
        conta.sacar(50);

        System.out.println(conta.recuperarSaldo());



    }
}