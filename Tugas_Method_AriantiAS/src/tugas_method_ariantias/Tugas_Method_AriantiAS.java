package tugas_method_ariantias;

import java.util.Scanner;

public class Tugas_Method_AriantiAS {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan jumlah perulangan yang diinginkan");
        int n = scan.nextInt();
        
        perulangan(n);
    }
    
    public static void perulangan(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Saya senang belajar Bahasa Java");
        }
    }
}
