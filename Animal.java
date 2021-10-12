package com.company;

public class Animal implements Voar{

    int idade;
    float tamanho;
    String som;

    public Animal() {
        this.idade = 0;
        this.tamanho = 0F;
        this.som = "";
    }

    void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public float getTamanho() {
        return tamanho;
    }

    void setSom(String som){
        this.som = som;
    }
    public String getSom() {
        return som;
    }

    @Override
    public void seVoa(boolean v) {

        if(v == true){
            System.out.print("\nO animal sabe voar!");
        }
        else{
            System.out.print("\nO animal não sabe voar.");
        }
    }
}
