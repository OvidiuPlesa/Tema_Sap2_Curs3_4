package com.itFactory.tema.problema13.formeGeometrice.dreptunghi;

public class Dreptunghi {

    int lungimeDreptunghi;
    int latimeDreptunghi;

    public Dreptunghi(){
        this.lungimeDreptunghi = 10;
        this.latimeDreptunghi = 5;
    }

    public void perimetruDreptunghi(){
        int perimetruDreptunghi;
        perimetruDreptunghi = (lungimeDreptunghi * 2) + (latimeDreptunghi * 2);

        System.out.println("Perimetrul Dreptunghiului este:  " + perimetruDreptunghi);
    }

    public void arieDreptunghi(){
        int arieDreptunghi;
        arieDreptunghi = lungimeDreptunghi * latimeDreptunghi;

        System.out.println("Aria Dreptunghiului este: " + arieDreptunghi);

    }


}
