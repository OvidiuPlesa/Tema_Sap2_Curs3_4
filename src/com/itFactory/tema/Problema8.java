package com.itFactory.tema;

/**
 *
 * Se da urmatorul text:
 * "Am DecIs Sa ImI faC TeMa AstAzI"
 * Scrieti un program prin care sa se afiseze textul scris cu litere mici iar apoi sa se afiseze textul scris cu litere mari.
 *
 */
public class Problema8 {
    public static void main(String[] args) {
        String text = "Am DecIs Sa ImI faC TeMa AstAzI";

        System.out.println("---------afisare text litere mici---------");
        System.out.println(text.toLowerCase());

        System.out.println("---------afisare text litere mari---------");
        System.out.println(text.toUpperCase());

    }
}
