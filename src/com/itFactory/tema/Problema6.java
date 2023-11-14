package com.itFactory.tema;

import java.util.Scanner;

/**
 *
 * Se da urmatorul text:
 * "Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook."
 * Sa se scrie un program prin care sa se corecteze textul si sa se inlocuiasca cuvintele gresite:
 * Aspecte:
 * 1. "NumePrenume" - se va inlocui cu numele cursantului.
 * 2. "testare" - se va inlocui cu tipul de curs la care participati.
 * 3. "facebook" - se va inlocui cu numele companiei unde participati la curs.
 *
 */
public class Problema6 {
    public static void main(String[] args) {

        String text = "Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook.";
//  Varianta cu introducere date de la tastatura :)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti Numele si Prenumele cursantului: ");
//        String numeCursant = scanner.nextLine();
//        System.out.println("Introduceti denumirea cursului: ");
//        String denumireCurs = scanner.nextLine();
//        System.out.println("Introduceti denumirea companiei: ");
//        String denumireCompanie = scanner.nextLine();

        String numeCursant = "Ovidiu Plesa";
        String denumireCurs = "Java";
        String denumireCompanie = "It Factory";

        text = text.replace("NumePrenume", numeCursant);
        text = text.replace("testare", denumireCurs);
        text = text.replace("facebook", denumireCompanie);
        System.out.println(text);

    }
}
