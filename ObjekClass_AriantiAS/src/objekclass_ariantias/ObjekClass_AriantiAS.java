/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objekclass_ariantias;

/**
 *
 * @author user
 */
public class ObjekClass_AriantiAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang();
        
        System.out.println("Persegi Panjang 1:");
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("-------------------------------");
        
        
        PersegiPanjang persegi1 = new PersegiPanjang(30, 40);

        System.out.println("Persegi Panjang 2:");
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        System.out.println("-------------------------------");
        
        
        PersegiPanjang persegi2 = new PersegiPanjang(25, 35);

        System.out.println("Persegi 2:");
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        System.out.println("-------------------------------");
    }

  }
    
