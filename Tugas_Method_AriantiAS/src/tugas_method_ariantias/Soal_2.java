/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_method_ariantias;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Soal_2 {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int batasAwal, batasAkhir;
        
        System.out.println("Masukan Batas Awal");
        batasAwal = scan.nextInt();
        do {
            System.out.println("Masukan Batas Akhir");
            batasAkhir = scan.nextInt();

            if (batasAkhir <= batasAwal) {
                System.out.println("Batas Akhir harus lebih besar dari Batas Awal, Silakan masukkan kembali.");
            }
        } while (batasAkhir <= batasAwal);
   
        int jumlahGenap = hitungDeretGenap(batasAwal, batasAkhir);

        System.out.println("Jumlah deret bilangan genap adalah " + jumlahGenap);
    }

    public static int hitungDeretGenap(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlah++;
            }
        }
        return jumlah;
    }
}

