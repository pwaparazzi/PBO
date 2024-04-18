/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_3;

/**
 *
 * @author user
 */
public class Method {
    public static int reverse(int bilangan) {
        int bilanganReverse = 0;
        
        while (bilangan != 0) {
            int digit = bilangan % 10;
            bilanganReverse = bilanganReverse * 10 + digit;
            bilangan /= 10;
        }
        
        return bilanganReverse;
    }

    // Return true if number is a palindrome
    public static boolean isPolindrom(int bilangan) {
        return bilangan == reverse(bilangan);
    }
}
