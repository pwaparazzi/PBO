/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_percabangan_arianti_2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class tugas_percabangan_arianti_2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nilai = new int[3];
        
        for( int i = 0; i < 3; i++){
            System.out.println("Masukan nilai ke " + (i+1));
            nilai[i] = scan.nextInt();
        }
        
        int max = nilai[0];
        for(int j = 1; j < 3; j++){
            if(max < nilai[j]){
                max = nilai[j];
            }
        }
        
        System.out.println("Nilai terbesar dari ketiga bilangan ");
        for(int j = 0; j < 3; j++){
            System.out.print(nilai[j] + " ");
        }
        System.out.println("adalah " + max);
    }
}
