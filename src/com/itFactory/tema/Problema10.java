package com.itFactory.tema;

import java.util.Scanner;

/**
 *
 * Se citesc doua variabile de tip String de la tastatura, din care unul va reprezenta un text oarecare,
 * iar cel de al doilea reprezinta un keyword care se va cauta in text.
 *    Se cere sa se numere de cate ori apare keyword-ul in textul respectiv
 *
 */
public class Problema10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu textul : ");
        String textOarecare = scanner.nextLine();

        System.out.println("Introdu keyword-ul : ");
        String textkeyword = scanner.nextLine();

        int countKeyword = 0; // initializarea counterului pentru keyword cu zero;
        String[] text = textOarecare.split(" ");

        for ( int i = 0; i < text.length; i++) {
            if (text[i].equals(textkeyword)) {
                    countKeyword ++;
            }
        }
            System.out.println("Cuvantul \"" + textkeyword + " apare de: " + countKeyword + " ori in text");


    }

}
