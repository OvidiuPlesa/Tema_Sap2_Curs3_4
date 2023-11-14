package com.itFactory.tema;

import java.util.Scanner;

/**
 *
 * Sa se creeze un program in care se citeste un sir de caractere de la tastatura care
 * va reprezenta numele unui candidat la introducerea intr-un sistem de contabilitate.
 * In cazul in care numele introdus depaseste lungimea de 25 de caractere,
 * afisati mesajul urmator: "Numele introdus este prea lung pentru sistem".
 * Aspecte:
 * 1. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar:
 * "Introduceti numele candidatului: ".
 *
 **/
public class Problema2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu numele candidatului: ");
        String numeCandidat = scanner.nextLine();

        if (numeCandidat.length() > 25){
            System.out.println("Numele introdus este prea lung pentru sistem");
        } else {
            System.out.println("Numele Introdus este: " + numeCandidat);
        }

    }

}
