package com.example.lucasbarrozo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

        ImageView imgResultado = (ImageView) findViewById(R.id.imgResultado);

        TextView txtResultado = findViewById(R.id.txtResultado);

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


        if ((escolhaApp == "pedra" && escolhaUsuario=="tesoura") || (escolhaApp == "papel" && escolhaUsuario=="pedra") || (escolhaApp == "tesoura" && escolhaUsuario=="papel")){
            //app ganha

            txtResultado.setTextColor(this.getColor(R.color.red));
            txtResultado.setText("Você Perdeu");

        } else if ((escolhaApp == "pedra" && escolhaUsuario=="papel") || (escolhaApp == "papel" && escolhaUsuario=="tesoura") || (escolhaApp == "tesoura" && escolhaUsuario=="pedra")){

            //usuário ganha

            txtResultado.setTextColor(this.getColor(R.color.green));
            txtResultado.setText("Vitória!");
        } else {

            //empate

            txtResultado.setTextColor(this.getColor(R.color.yellow));
            txtResultado.setText("Empate!");
        }


    }
}
