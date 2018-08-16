package com.example.lucasbarrozo.classesemetodosnapratica;

public class Conta {

    private int numeroConta;
    private double saldo = 100;

    public double exibirSaldo(){
        return this.saldo;
    }

    public void depositar (double valorDeposito) {
        this.saldo = this.saldo+ valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }

}
