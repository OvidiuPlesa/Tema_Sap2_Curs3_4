package com.itFactory.tema.problema13.formeGeometrice.patrat;

public class Patrat {

    int laturaPatrat;

    public Patrat(){
        this.laturaPatrat = 6;
    }

    public void perimetruPatrat(){
        int perimetruPatrat;
        perimetruPatrat = laturaPatrat * 4;
        System.out.println("Perimetru patratului este: " + perimetruPatrat);
    }

    public void ariePatrat(){
        int ariePatrat;
        ariePatrat = laturaPatrat * laturaPatrat;
        System.out.println("Aria Patratului este: " + ariePatrat);
    }


}
