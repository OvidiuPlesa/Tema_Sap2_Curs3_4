package com.itFactory.tema.problema13.formeGeometrice.triunghi;

public class Triunghi {

    int latura1;
    int latura2;
    int latura3;

    public Triunghi(int latura1, int latura2, int latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public Triunghi(){
        this(6, 10, 8);
    }

    public void perimetruTriunghi(){

        int perimetruTriunghi;

        perimetruTriunghi = latura1 + latura2 + latura3;

        System.out.println("Perimetul triunghiului este: " + perimetruTriunghi);

    }
}
