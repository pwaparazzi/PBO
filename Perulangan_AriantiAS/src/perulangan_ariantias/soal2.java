/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perulangan_ariantias;

import java.util.Scanner;

/**
 *
 * @author gita
 */

import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
      
        int jumlah = 0;
        System.out.println("Masukan Batas Awal");
        int batasAwal = scan.nextInt();
        System.out.println("Masukan Batas Akhir");
        int batasAkhir = scan.nextInt();
        
        for(int i = batasAwal; i <= batasAkhir; i++){
            if(i % 2 == 0){
                jumlah = jumlah + 1;
            }
        }
        System.out.println("Jumlah deret bilangan genap adalah " + jumlah);
    }
}
