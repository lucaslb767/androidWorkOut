package com.example.lucasbarrozo.classesemetodosnapratica;

 class Funcionario {

     //propriedades

     String nome;
     double salario;

     //métodos - sem retorno
    /* void recuperarSalario(){

         this.salario = this.salario - (this.salario*.1);
         System.out.println(this.salario);
     } */

    //métodos - com retorno

     double recuperarSalario(double bonus, double descontoAdicional) {
         this.salario = this.salario - (this.salario*.1);

         return this.salario + bonus - descontoAdicional;
     }

}
