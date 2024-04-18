/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_ariantias;

/**
 *
 * @author user
 */
class polindrom {
    public boolean isPolindrom(String str) {
        int panjang = str.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (str.charAt(i) != str.charAt(panjang - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
