/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal_1;

/**
 *
 * @author gita
 */
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukan kombinasi angka 3 kali: ");
        
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        int z = myObj.nextInt();
        
        System.out.println( "x = " + x);
        System.out.println( "y = " + y);
        System.out.println( "z  = " + z);
        System.out.println( "x + y = " + (x + y));
        System.out.println( "y - z = " + ( y - z ));
        
        x = x * y / z;
        y = x + z - 2;
        z = (y * z) / x; 
        
        System.out.println( "x * y / z =" + x);
        System.out.println( "x + z - 2 = " + y);
        System.out.println( "(y * z) / x = " + z);
        
        
    }
    
}
