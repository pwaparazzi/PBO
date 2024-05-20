/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritante_ariantias;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Segitiga segitiga = new Segitiga();

    System.out.print("Masukkan sisi1: ");
    double side1 = input.nextDouble();
    System.out.print("Masukkan sisi2: ");
    double side2 = input.nextDouble();
    System.out.print("Masukkan sisi3: ");
    double side3 = input.nextDouble();

    System.out.print("Masukkan warna: ");
    String warna = input.next();

    System.out.print("Apakah segitiga terisi (true/false): ");
    boolean filled = input.nextBoolean();

    segitiga.setSisi1(side1);
    segitiga.setSisi2(side2);
    segitiga.setSisi3(side3);
    segitiga.setWarna(warna);
    segitiga.setFilled(filled);
    System.out.println(segitiga);
    }
}
