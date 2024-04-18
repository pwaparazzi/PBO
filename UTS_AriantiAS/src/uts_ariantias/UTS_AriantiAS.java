/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_ariantias;

/**
 *
 * @author gita
 */

import java.util.Scanner;
public class UTS_AriantiAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        polindrom palindrome = new polindrom();
        Scanner scan = new Scanner(System.in);
        
        String bilangan; 
        
        System.out.println("Masukan tiga digit integer contoh : 123 ");
        bilangan = scan.next();
        int panjang = bilangan.length();
        if(panjang != 3){
            System.out.println("Bilangan bukan tiga digit masukan kembali! ");
            bilangan = scan.next();
        }
        
        if (palindrome.isPolindrom(bilangan)) {
            System.out.println(bilangan + " adalah palindrom.");
        } else {
            System.out.println(bilangan + " bukan palindrom.");
        }
        
    }
    
}
