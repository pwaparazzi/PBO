/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_4;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok();
        
        System.out.println("Balok 1");
        System.out.println("Luas: " + balok.getLuas());
        System.out.println("Keliling: " + balok.getKeliling());
        System.out.println("Volume: " + balok.getVolume());
        System.out.println("-------------------------------");
        
        
        Balok balok1 = new Balok(30, 40, 50);

        System.out.println("Balok 2");
        System.out.println("Luas: " + balok1.getLuas());
        System.out.println("Keliling: " + balok1.getKeliling());
        System.out.println("Volume: " + balok1.getVolume());
        System.out.println("-------------------------------");
        
        
        Balok balok2 = new Balok(25, 35, 45);

        System.out.println("Balok 3");
        System.out.println("Luas: " + balok2.getLuas());
        System.out.println("Keliling: " + balok2.getKeliling());
        System.out.println("Volume: " + balok2.getVolume());
        System.out.println("-------------------------------");
    }
}
