package com.example.lucasbarrozo.classesemetodosnapratica;

public class Lucas extends Cidadao implements Presidente {


    @Override
    public void ganharEleicao() {
        System.out.println("Virar presidente do Brasil");
    }
}
