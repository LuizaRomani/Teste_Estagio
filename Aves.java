package com.company;

public class Aves extends Animal{
    String penas;

    public Aves(){
        this.penas = "";
    }

    void setPenas(String penas) {
        this.penas = penas;
    }
    public String getPenas() {
        return penas;
    }

    public void botouOvos(boolean ovo) {
        if(ovo == true){
            System.out.print("\nAve botou ovos hoje!");
        }
        else{
            System.out.print("\nAve ainda não botou ovos.");
        }
    }
}
