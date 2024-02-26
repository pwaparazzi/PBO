/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_percabangan_arianti_3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class tugas_percabangan_arianti_3 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lama = new int[3];
        int[] biaya = new int[3];
        
        for( int i = 0; i < 3; i++){
            System.out.println("Masukan data parkir mobil ke " + (i+1));
            
            System.out.print("Jam Masuk: ");
            int jamMasuk = scan.nextInt();

            System.out.print("Jam Keluar: ");
            int jamKeluar = scan.nextInt();
            
            if (jamKeluar >= jamMasuk) {
                lama[i] = jamKeluar - jamMasuk;
            } else {
                lama[i] = (12 - jamMasuk) + jamKeluar;
            }
            
            int biayaAwal = 1500; 
            int biayaPerJam = 1000;

            if (lama[i] <= 2) {
                biaya[i] = biayaAwal;
            } else {
                biaya[i] = biayaAwal + (biayaPerJam * (lama[i] - 2));
            }
        }
        
        for(int j = 0; j< 3; j++){
            System.out.println("Mobil ke " + (j+1));
            System.out.println("Lama " + lama[j] + " jam");
            System.out.println("Biaya Rp." + biaya[j]);
        }
    }
    
}
