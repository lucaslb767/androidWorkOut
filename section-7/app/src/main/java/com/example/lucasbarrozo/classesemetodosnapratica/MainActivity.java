package com.example.lucasbarrozo.classesemetodosnapratica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Joao";
        funcionario.salario = 2000;

        double salarioRecuperado = funcionario.recuperarSalario(150, 30);
        System.out.println("Jão recebe: "+salarioRecuperado);


        /*
        Casa minhaCasa = new Casa();

        minhaCasa.cor = "azul";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();

        */
    }
}
