package com.itFactory.tema.problema12;

public class MemorieSSD
{
    private int capacitateStocare;
    private String unitateMasura;

    public MemorieSSD(int capacitateStocare, String unitateMasura)
    {
        this.capacitateStocare = capacitateStocare;
        this.unitateMasura = unitateMasura;
    }

    public int getCapacitateStocare()
    {
        return capacitateStocare;
    }

    public String getUnitateMasura()
    {
        return unitateMasura;
    }

    public void setCapacitateStocare(int capacitateStocare) {
        this.capacitateStocare = capacitateStocare;
    }

    public void setUnitateMasura(String unitateMasura) {
        this.unitateMasura = unitateMasura;
    }
}
