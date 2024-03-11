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
public class Soal_3 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan bilangan pertama");
        int a = scan.nextInt();
        System.out.println("Masukan bilangan kedua");
        int b = scan.nextInt();

        int pbt = hitungPBT(a, b);

        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + pbt);
    }

    public static int hitungPBT(int a, int b) {
        int min = (a < b) ? a : b;
        int PBT = 1;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                PBT = i;
            }
        }
        return PBT;
    }
}
