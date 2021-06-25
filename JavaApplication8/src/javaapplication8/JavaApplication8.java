/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double boy, kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = sc.nextDouble();
        System.out.print("\nLütfen kilonuzu giriniz: ");
        kilo = sc.nextDouble();
        double sonuc = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + sonuc);
    }
    
}
    

