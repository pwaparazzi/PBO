/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

/**
 *
 * @author user
 */
public class Pattern_D {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = i; j >=1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print(k+ " ");
            } 
            System.out.println();
            }
        }
    }

