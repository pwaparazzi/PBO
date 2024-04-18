/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_4;

/**
 *
 * @author user
 */
public class Balok {
    int panjang, lebar, tinggi;
    
    public Balok(){
        panjang = 1;
        lebar = 1;
        tinggi = 1;
}
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    public void setLebar(int lebarBaru){
        panjang = lebarBaru;
    }
    
    public void setTinggi(int tinggiBaru){
        panjang = tinggiBaru;
    }
    
    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }
    
    public int getLuas(){
        return 2 * ( (panjang * lebar) + ( panjang * tinggi) + (lebar * tinggi));
    }
    
    public int getKeliling(){
        return 4 * ( panjang + lebar + tinggi);
    }
    
    public int getVolume(){
        return panjang * lebar * tinggi;
    }
}
