/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi, sonuc = 4;
        System.out.println("Sayi Girin: ");
        sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j < i; j++) {
                sonuc = sonuc * 4;
            }
            System.out.println("4 üssü " + i + " = " + sonuc);
            sonuc = 4;
        }

        sonuc = 5;
        System.out.println("");

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j < i; j++) {
                sonuc = sonuc * 5;
            }
            System.out.println("5 üssü " + i + " = " + sonuc);
            sonuc = 5;
        }

    }
    
}
