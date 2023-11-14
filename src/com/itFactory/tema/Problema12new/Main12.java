package com.itFactory.tema.Problema12new;

/**
 *
 * Se cer urmatoarele implementari.
 *
 * 1.Sa se ajusteze clasa Laptop in care sa se adauge doua proprietati. Una va fi de tip Ram,
 * iar cealalata va fi de tipul MemorieSSD.
 * Ambele proprietati vor fi declarate cu modificatorul de access "private".
 * 2. Ajustati corespunzator constructorii (in cazul in care sunt) si implementati getters & setters
 * pentru noile valori.
 * Atentie: Unde nu s-au implementat pentru proprietatile din clasa, implementati corespunzator.
 * 3. in clasa com.itfactory.Main, in metoda main se va crea un obiect de tipul
 * Laptop si se vor atribui valori tutoror proprietatilor, corespunzator.
 * (Atentie: Unde aveti constructor cu parametrii, folositi-l.
 * Pentru simplitate, daca doriti va puteti crea constructori cu parametri in clase).
 * 4. Se vor afisa toate detaliile unui obiect creat de tipul Laptop.
 *
 * Exemplu de afisare:
 * Detalii laptop:
 * Marca: Asus
 * Culoare: Negru
 * Dimensiune Ecran: 15.6
 *
 * Memorie RAM:
 * Tip memorie RAM: DDR3
 * Unitate de Masura Memorie RAM: GB
 * Capacitate memorie RAM: 16
 *
 * Spatiu de stocare SSD:
 * Capacitate stocare SSD: 256
 * Unitate de masura stocare SSD: GB
 *
 *
 */
public class Main12 {

    public static void main(String[] args) {

        Ram ram = new Ram("DDR3", "GB", 16);

        MemorieSSD memorieSSD = new MemorieSSD(" ",256, "GB");

        Laptop laptop = new Laptop("Asus","Negru", 15.6, ram, memorieSSD);

        System.out.println("Detalii laptop: ");
        System.out.println("Marca: " + laptop.getMarca());
        System.out.println("Culoare: " + laptop.getCuloare());
        System.out.println("Dimensiune Ecran: " + laptop.getDimensiuneEcran());
        System.out.println("-----------------------");

        System.out.println("-----------------------");
        System.out.println("Memorie RAM: ");
        System.out.println("Tip memorie RAM: " + laptop.getRam().getTipMemorieRam());
        System.out.println("Unitate de Masura Memorie RAM: " + laptop.getRam().getUnitateDeMasuraMemorieRam());
        System.out.println("Capacitate memorie RAM: " + laptop.getRam().getCapacitateMemorieRam());
        System.out.println("-----------------------");

        System.out.println("-----------------------");
        System.out.println("Spatiu de stocare SSD: " + laptop.getMemorieSSD().getSpatiuDeStocareSSD());
        System.out.println("Capacitate stocare SSD: " + laptop.getMemorieSSD().getCapacitateStocareSSD());
        System.out.println("Unitate de masura stocare SSD: " + laptop.getMemorieSSD().getUnitateDeMasuraStocareSSD());


    }
}
