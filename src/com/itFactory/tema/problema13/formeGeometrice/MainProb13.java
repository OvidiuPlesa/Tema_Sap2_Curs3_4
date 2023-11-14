package com.itFactory.tema.problema13.formeGeometrice;

import com.itFactory.tema.problema13.formeGeometrice.dreptunghi.Dreptunghi;
import com.itFactory.tema.problema13.formeGeometrice.patrat.Patrat;
import com.itFactory.tema.problema13.formeGeometrice.triunghi.Triunghi;

public class MainProb13 {

    public static void main(String[] args) {

        Triunghi triunghi = new Triunghi();

        Patrat patrat = new Patrat();

        Dreptunghi dreptunghi = new Dreptunghi();

        triunghi.perimetruTriunghi();
        patrat.ariePatrat();
        patrat.perimetruPatrat();
        dreptunghi.perimetruDreptunghi();
        dreptunghi.arieDreptunghi();


    }
}
