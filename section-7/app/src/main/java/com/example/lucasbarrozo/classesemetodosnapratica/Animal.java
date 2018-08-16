package com.example.lucasbarrozo.classesemetodosnapratica;

 class Animal {

     int tamanho;
     String cor;
     double peso;

     //Getter and Setter


     public int getTamanho() {
         return tamanho;
     }

     public void setTamanho(int tamanho) {
         this.tamanho = tamanho;
     }

     public double getPeso() {
         return peso;
     }

     public void setPeso(double peso) {
         this.peso = peso;
     }

     void setCor(String cor) {
        this.cor = cor;
     }

     String getCor(){
         return this.cor;
     }

     void dormir(){
         System.out.println("Dorme");
     }

     void correr(){
         System.out.println("Corre");
     }
}
