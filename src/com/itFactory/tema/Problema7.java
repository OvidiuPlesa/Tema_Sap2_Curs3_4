package com.itFactory.tema;

/**
 * Se da urmatorul text:
 * "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina"
 * Scrieti un program prin care sa se inlcouiasca primele 5 instante ale cuvantului "avion" cu cuvantul
 * "racheta" si primele 3 instante ale cuvantului "masina" cu cuvantul "autobuz" din textul dat.
 * Aspecte.
 * 2. Output: racheta racheta racheta racheta racheta avion avion avion , autobuz autobuz autobuz masina masina masina masina
 *
 */
public class Problema7 {
    public static void main(String[] args) {

        String text = "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina";

        System.out.println(text.length());

        for (int i=1; i <= 5; i++) {
            text = text.replaceFirst("avion", "racheta");
        }
        for (int i=1; i <= 3; i++) {
            text = text.replaceFirst("masina", "autobuz");
        }

        System.out.println(text);


    }
}
