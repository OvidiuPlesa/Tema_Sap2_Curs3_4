package com.itFactory.tema.problema12;

import com.itFactory.tema.Problema12new.MemorieSSD;
import com.itFactory.tema.Problema12new.Ram;

public class problema12 {

    public static void main(String[] args) {

        Ram ram = new Ram("DDR3", "GB", 16);
        ram.setCapacitateMemorieRam(32);
        ram.setTipMemorieRam("DDR5");

        MemorieSSD memorieSSD = new MemorieSSD(" ", 256, "GB");

        Laptop laptop = new Laptop("Hp", "Argintiu", 17.3, ram, memorieSSD);

        System.out.println("Detalii.laptop: " + " \nMarca: " + laptop.getMarca() + " \nCuloarea: " + laptop.getCuloare()
                + " \nDimensiune ecran" + laptop.getDimensiuneEcran());

        System.out.println("                                  ");
        System.out.println("Memorie Ram : " + " \nTip Memorie: " + laptop.getRam().getTipMemorieRam() +
                " \nUnitatea de masura memorie: " + laptop.getRam().getUnitateDeMasuraMemorieRam() +
                "\nCapacitate Memorie" + laptop.getRam().getCapacitateMemorieRam());

        System.out.println("                                  ");
        System.out.println("Spatiu de Stocare SSD:" + laptop.getMemorieSSD().getCapacitateStocareSSD() +
                " \nCapacitate Stocare SSD :" +  laptop.getMemorieSSD().getCapacitateStocareSSD() +
                " \nUnitate de Masura Stocare SSD: " + laptop.getMemorieSSD().getUnitateDeMasuraStocareSSD());





    }
}
