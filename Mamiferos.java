package com.company;

public class Mamiferos extends Animal{
    String pelo;

    public Mamiferos() {
        this.pelo = "";
    }

    void setPelo(String pelo){
        this.pelo = pelo;
    }
    public String getPelo() {
        return pelo;
    }

    public void filhoteAmamentado(boolean amamentar) {
        if(amamentar == true){
            System.out.print("\nFilhote amamentado!");
        }
        else{
            System.out.print("\nFilhote não foi amamentado.");
        }
    }
}
