package com.itFactory.tema;

import java.util.Scanner;

/**
 *
 * Creati un program prin care, avand un text introdus la tastatura,
 * sa se numere cate caractere mici are textul si cate caractere mari are acel text.
 */
public class Problema9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti textul: ");
        String text = scanner.nextLine();

        int coutCaractereMici = 0;
        int countCaractereMari = 0;
        int countCaractereSpeciale = 0;

        for ( int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                coutCaractereMici ++;
            } else if (ch >= 'A' && ch <= 'Z') {
                countCaractereMari ++;
            } else {
                    countCaractereSpeciale ++;
              }
        }
        System.out.println("Numarul caracterelor mici este: " + coutCaractereMici);
        System.out.println("Numarul caracterelor mari este: " + countCaractereMari);
        System.out.println("Numarul caracterelor speciale este: " + countCaractereSpeciale);
    }
}
