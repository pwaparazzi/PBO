/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritante_ariantias.Soal2;

/**
 *
 * @author user
 */
class Date {
    int tahun;
    int bulan;
    int hari;
    
    public Date(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public int getBulan() {
        return bulan;
    }
    
    public int getHari() {
        return hari;
    }
    
    @Override
    public String toString() {
        return tahun + "-" + bulan + "-" + hari;
    }
}