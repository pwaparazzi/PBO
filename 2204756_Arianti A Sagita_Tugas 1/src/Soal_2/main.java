/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean naikKelas;
        System.out.print("Masukkan peringkat anda: ");
        int peringkat = myObj.nextInt();
        if (peringkat >= 1 && peringkat <= 10) {
             naikKelas = true;
         } else {
             System.out.print("Apakah Anda naik kelas? (true/false): ");
             naikKelas = myObj.nextBoolean();
         }

         if (peringkat == 1 && naikKelas) {
             System.out.println("Selamat! Anda mendapatkan set alat tulis sekolah");
         } else {
             System.out.println("Maaf, Anda tidak memenuhi syarat menerima hadiah.");
         }
    }
}
