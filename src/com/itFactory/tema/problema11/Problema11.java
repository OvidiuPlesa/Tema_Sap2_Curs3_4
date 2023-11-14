package com.itFactory.tema.problema11;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * Sa se implementeze joculetul Fazan. (Studiati metoda substring cu doi parametri/argumenti) -
 * https://beginnersbook.com/2013/12/java-string-substring-method-example/
 *    Fazan presupune ca intr-un grup de membri, fiecare va incerca sa formeze un cuvant incepand cu
 *    cu ultimele doua litere ale cuvantului precedent.
 *    O sa alegeti un cuvant initial aleatoriu (presupunem ca incepe calculatorul).
 *    			Daca utilizatorul introduce un cuvant care nu incepe cu acea grupare, jocul se termina
 *    			Daca sunteti blocati in a introduce un cuvant (Exemplu: dupa cuvintele care se termina
 *    			in "nt") utilizatorul o sa introduca un String empty iar programul se termina.
 *
 *    Cuvant de inceput: "animal".
 *    Introduceti un cuvant care incepe cu "al": alfabet
 *    Introduceti un cuvant care incepe cu "et": etaj
 *    Introduceti un cuvant care incepe cu "aj": altceva
 *    Jocul s-a terminat!
 */

public class Problema11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduc cuvantul de start in Joc: ");
        String cuvant = scanner.nextLine();

        Boolean unSingurCuvant = false;
        Boolean cuvantDoarCuLitere = false;
        Boolean verificareUltimel2Litere = false;

        // verifica sa fie un String care sa contina un singur cuvant:
        String[] array = cuvant.trim().split(" ");
        if (array.length == 1) {
            unSingurCuvant = true;
        // se verifica ca acel cuvant sa contina doar litere:
            if (Pattern.matches("[a-zA-Z]+",cuvant)) {
                System.out.println("Primul cuvant introdus: " + cuvant);
                cuvantDoarCuLitere = true;
            } else {
                System.out.println("Cuvantul indrodus Nu contine doar litere: " + cuvant);
            }
        } else {
            System.out.println("Ati introdus mai multe cuvinte");
        }
        System.out.println("unSingurCuvant este: " + unSingurCuvant);
        System.out.println("cuvantDoarLitere este: " + cuvantDoarCuLitere);
        // determinarea ultimelor 2 litere din cuvant
        String ultimele2Litere = cuvant.substring(cuvant.length() - 2);
//        verificareUltimel2Litere = ultimele2Litere == "nt";
        if (ultimele2Litere.equals("nt")){
            System.out.println("Atentie !!!! Ultimele 2 LITERE SUNT : " + ultimele2Litere);
            verificareUltimel2Litere = true;
        }
        System.out.println("Ultimele 2 litere sunt diferite de Nt? : " + verificareUltimel2Litere);

        if ((unSingurCuvant == true) && (cuvantDoarCuLitere == true) && (verificareUltimel2Litere == false)) {
            System.out.println("******************************************");
            System.out.println("Start joc !");
            System.out.println("******************************************");

        do {
            System.out.println("Cuvantul Introdus este: " + cuvant );
            System.out.println("Introdu un cuvant care sa inceapa cu : " + ultimele2Litere);
            String noulCuvant = scanner.nextLine();

            if (noulCuvant.startsWith(ultimele2Litere)) {
                cuvant = noulCuvant;
                ultimele2Litere = cuvant.substring(cuvant.length() - 2);
                System.out.println("Felicitari! Cuvantul este corect! " +
                        "Urmatorul cuvant trebuie sa inceapa cu: " + ultimele2Litere + ".");
            } else {
                System.out.println("Stop Joc!!!");
                System.out.println("Cuvantul introdus nu contine ultimele doua litere din cuvantul anterior :"
                        + cuvant);
                break;
            }
            if (noulCuvant.isEmpty()) {
                System.out.println("Nu ati introdus un cuvant !");
                break;
            }
            if (ultimele2Litere.equals("nt")) {
                System.out.println("Stop Joc Fazan !");
                break;
            }
        }
        while (((unSingurCuvant == true) && (cuvantDoarCuLitere == true)) && (verificareUltimel2Litere == false) );
        }
    }
}
