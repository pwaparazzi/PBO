/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_3;

/**
 *
 * @author gita
 */
import java.util.Scanner;
public class main {
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Method methods = new Method();
        
        System.out.println("Masukan bilangan: contoh (123) ");
        int bilangan = scan.nextInt();

        System.out.println("Bilangan yang diinput: " + bilangan);
        System.out.println("Bilangan setelah di balik: " + methods.reverse(bilangan));
        if(methods.isPolindrom(bilangan)){
            System.out.println(bilangan + " merupakan bilangan polindrom");
        }else{
            System.out.println(bilangan + " bukan bilangan polindrom");
        }
    }
}
