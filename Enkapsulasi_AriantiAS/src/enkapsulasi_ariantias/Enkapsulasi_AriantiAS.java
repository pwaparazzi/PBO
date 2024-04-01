/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkapsulasi_ariantias;

/**
 *
 * @author user
 */
public class Enkapsulasi_AriantiAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinearEquation persamaan = new LinearEquation();
        persamaan.inputVariabel();
        if (persamaan.isSolvable()) {
            System.out.println("Persamaan memiliki solusi");
            System.out.println("Solusi: x = " + persamaan.getX() + ", y = " + persamaan.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
}
    
