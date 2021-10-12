package com.company;

public class Main {

    public static void main(String[] args) {
        Mamiferos m = new Mamiferos(); //morcego
        m.setIdade(10);
        m.setTamanho(1.5F);
        m.setSom("Farfalho");

        m.setPelo("Preto");

        System.out.print("=== Morcego ===\n" +
                "IDADE: "+m.getIdade()+"\n"+
                "TAMANHO: "+m.getTamanho() +"\n"+
                "SOM EMITIDO: "+m.getSom() +"\n"+
                "COR DO PELO: "+m.getPelo());
        m.filhoteAmamentado(false);

        m.seVoa(true);

        //----------------------------
        Mamiferos l = new Mamiferos(); //leao
        l.setIdade(2);
        l.setTamanho(204.5F);
        l.setSom("Rugido");

        l.setPelo("Castanho Amarelado");

        System.out.print("\n\n=== Leão ===\n" +l.getIdade()+"\n"+l.getTamanho() +"\n"+ l.getSom() +"\n"+ l.pelo);
        l.filhoteAmamentado(true);

        l.seVoa(false);

        //-----------------------
        Aves g = new Aves(); //gavião
        g.setIdade(5);
        g.setTamanho(2.6F);
        g.setSom("Atiado");

        g.setPenas("Marrom claro");

        System.out.print("\n\n=== Gavião ===\n" +g.getIdade()+"\n"+g.getTamanho() +"\n"+ g.getSom() +"\n"+ g.getPenas());
        g.botouOvos(false);

        g.seVoa(true);

        //----------------------
        Aves a = new Aves(); //avestruz
        a.setIdade(7);
        a.setTamanho(120.3F);
        a.setSom("Grasnido");

        a.setPenas("Castanho");

        System.out.print("\n\n=== Avestruz ===\n" +a.getIdade()+"\n"+a.getTamanho() +"\n"+ a.getSom() +"\n"+ a.getPenas());
        a.botouOvos(true);

        a.seVoa(false);
    }
}
