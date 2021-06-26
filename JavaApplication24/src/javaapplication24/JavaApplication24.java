/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi Giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("Kaçıncı Dereceden Olacağını Giriniz: ");
        int üs = scan.nextInt();
        
        int sonuc = 1;
        
        for (int i = 1; i <= üs; i++) {
            sonuc *= sayi;
        }
        
        System.out.println("Sonuç = " + sonuc);
        
    }
    
}
