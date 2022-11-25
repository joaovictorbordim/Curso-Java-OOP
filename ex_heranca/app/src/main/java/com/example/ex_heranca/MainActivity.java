package com.example.ex_heranca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cao cao = new Cao();
        cao.correr();
        //cao.latir();
        //cao.setCor("Azul")

        //System.out.println(cao.getCor());

    //assaro passaro = new Passaro();
    //passaro.dormir();
    //passaro.setCor("Verde");

    //System.out.println(passaro.getCor());

    /*Animal animal = new Animal();
    animal.correr();*/

    }
}
