package com.example.lucasbarrozo.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase (View view){

        TextView texto = findViewById(R.id.text_resultado);

        String [] frases = {"Frase 1", "Frase 2", "Frase 3"};

        int numero = new Random().nextInt(frases.length);

        texto.setText(frases[numero]);



    }
}
