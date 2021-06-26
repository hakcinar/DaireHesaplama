/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("N Değerini Giriniz");
        int n = scan.nextInt();
        System.out.println("R Değerini Giriniz");
        int r = scan.nextInt();

        int faktoriyel_1 = 1;
        int faktoriyel_2 = 1;
        int faktoriyel_3 = 1;
        int fark = n - r;

        for (int i = 1; i <= n; i++) {

            faktoriyel_1 = faktoriyel_1 * i;
        }
        System.out.println("N Sayısının Faktöriyeli : " + faktoriyel_1);

        for (int j = 1; j <= r; j++) {

            faktoriyel_2 = faktoriyel_2 * j;
        }
        System.out.println("R Sayısının Faktöriyeli : " + faktoriyel_2);

        for (int k = 1; k <= fark; k++) {

            faktoriyel_3 = faktoriyel_3 * k;
        }
        System.out.println("(N-R)'nin Faktöriyeli : " + faktoriyel_3);

        int carpim = faktoriyel_2 * faktoriyel_3;
        int kombinasyon = faktoriyel_1 / carpim;

        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
  }
    
}
