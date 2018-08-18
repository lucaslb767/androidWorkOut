package com.example.lucasbarrozo.classesemetodosnapratica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        AdamSmith adamSmith = new AdamSmith();
        adamSmith.direitosDeveres();








//        ContaBancaria conta = new ContaBancaria(22908);






        /*
        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("Maria", 27);
        */

        /*
        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);

        System.out.println(conta.exibirSaldo());
        */





        /*
        Cao cao = new Cao();
        cao.correr();

        */

        /*
        Animal animal = new Animal();
        animal.correr();
        */




        /*
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Joao";
        funcionario.salario = 2000;

        double salarioRecuperado = funcionario.recuperarSalario(150, 30);
        System.out.println("Jão recebe: "+salarioRecuperado);

            */
        /*
        Casa minhaCasa = new Casa();

        minhaCasa.cor = "azul";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();

        */
    }
}
