/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi_ariantias;

/**
 *
 * @author arianti
 */

import java.util.Scanner;

class LinearEquation {
    private double a,b,c,d,e,f;
    
    public LinearEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }
    
    public void inputVariabel() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan variabel untuk persamaan linear ax + by = e dan cx + dy = f:");
        System.out.print("Masukkan nilai a: ");
        this.a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        this.b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        this.c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        this.d = input.nextDouble();
        System.out.print("Masukkan nilai e: ");
        this.e = input.nextDouble();
        System.out.print("Masukkan nilai f: ");
        this.f = input.nextDouble();
    }
    
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getD() {
        return this.d;
    }

    public double getE() {
        return this.e;
    }

    public double getF() {
        return this.f;
    }
    
    public boolean isSolvable() {
        return this.a * this.d - this.b * this.c != 0;
    }
    
    public double getX() {
        return (this.e * this.d - this.b * this.f) / 
               (this.a * this.d - this.b * this.c);
    }

    public double getY() {
        return (this.a * this.f - this.e * this.c) / 
               (this.a * this.d - this.b * this.c);
    }
}
