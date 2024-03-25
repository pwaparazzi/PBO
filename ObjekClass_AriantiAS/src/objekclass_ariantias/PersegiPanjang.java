/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objekclass_ariantias;

/**
 *
 * @author user
 */

class PersegiPanjang{
    private int panjang, lebar;
    
    public PersegiPanjang(){
    panjang = 1;
    lebar = 1;
}
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    public void setLebar(int lebarBaru){
        panjang = lebarBaru;
    }
    
    public PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    public int getLuas(){
        return panjang * lebar;
    }
    
    public int getKeliling(){
        return 2 * ( panjang + lebar);
    }

}