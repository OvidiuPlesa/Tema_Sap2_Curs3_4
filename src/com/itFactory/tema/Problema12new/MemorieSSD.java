package com.itFactory.tema.Problema12new;

public class MemorieSSD {

    private String spatiuDeStocareSSD;
    private int capacitateStocareSSD;

    private String unitateDeMasuraStocareSSD;

    public MemorieSSD(String spatiuDeStocareSSD, int capacitateStocareSSD, String unitateDeMasuraStocareSSD) {
        this.spatiuDeStocareSSD = spatiuDeStocareSSD;
        this.capacitateStocareSSD = capacitateStocareSSD;
        this.unitateDeMasuraStocareSSD = unitateDeMasuraStocareSSD;
    }

    public String getSpatiuDeStocareSSD() {
        return spatiuDeStocareSSD;
    }

    public int getCapacitateStocareSSD() {
        return capacitateStocareSSD;
    }

    public String getUnitateDeMasuraStocareSSD() {
        return unitateDeMasuraStocareSSD;
    }

    public void setSpatiuDeStocareSSD(String spatiuDeStocareSSD){
        this.spatiuDeStocareSSD = spatiuDeStocareSSD;
    }

    public void setCapacitateStocareSSD(int capacitateStocareSSD){
        this.capacitateStocareSSD = capacitateStocareSSD;
    }

    public void setUnitateDeMasuraStocareSSD(String unitateDeMasuraStocareSSD){
        this.unitateDeMasuraStocareSSD = unitateDeMasuraStocareSSD;
    }
}
