/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_percabangan_arianti;

/**
 *
 * @author gita
 */
import java.util.Scanner;

public class Tugas_Percabangan_Arianti {

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
        
        for(int j = 0; j < 3; j++){
            if(nilai[j] >= 1000 && nilai[j] <= 9999){
                System.out.println("bilangan " + nilai[j] + " merupakan bilangan ribuan");
            }else{
                System.out.println("Bilangan " + nilai[j] + " bukan bilangan ribuan");
            }
        }
    }
    
}
