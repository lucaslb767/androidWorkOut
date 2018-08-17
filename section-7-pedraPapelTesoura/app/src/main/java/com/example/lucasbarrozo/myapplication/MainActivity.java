package com.example.lucasbarrozo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario){

        ImageView imgResultado = findViewById(R.id.imgResultado);

        //gerar número aleatorio para escolha do App

        String[] opcoes = {"pedra","papel","tesoura"};

        int numero = new Random().nextInt(3);

        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {

            case "pedra":
                imgResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imgResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imgResultado.setImageResource(R.drawable.tesoura);
                break;
        }


    }
}
