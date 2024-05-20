/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritante_ariantias.Soal2;

/**
 *
 * @author user
 */

class Person {
     String nama, alamat, telepon, email;
    
    public Person(String nama, String alamat, String telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String getTelepon() {
        return telepon;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Person: " + nama;
    }
}

class Student extends Person {
    public static String Maru1 = "Mahasiswa Baru";
    public static String Maru2 = "Mahasiswa Baru tahun kedua";
    public static String Junior = "Junior";
    public static String Senior = "Senior";
    
    String status;
    
    public Student(String nama, String alamat, String telepon, String email, String status) {
        super(nama, alamat, telepon, email);
        this.status = status;
    }
    
    public String getClassStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return "Student: " + getNama();
    }
}

class Employee extends Person {
     String kantor;
     double gaji;
     Date dateRekrut;
    
    public Employee(String nama, String alamat, String telepon, String email, String kantor, double gaji, Date dateRekrut) {
        super(nama, alamat, telepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.dateRekrut = dateRekrut;
    }
    
    public String getKantor() {
        return kantor;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public Date getDateRekrut() {
        return dateRekrut;
    }
    
    @Override
    public String toString() {
        return "Employee: " + getNama();
    }
}

class Faculty extends Employee {
     String JamKerja;
     String rank;
    
    public Faculty(String nama, String alamat, String telepon, String email, String kantor, double gaji, Date dateRekrut, String JamKerja, String rank) {
        super(nama, alamat, telepon, email, kantor, gaji, dateRekrut);
        this.JamKerja = JamKerja;
        this.rank = rank;
    }
    
    public String getJamKerja() {
        return JamKerja;
    }
    
    public String getRank() {
        return rank;
    }
    
    @Override
    public String toString() {
        return "Faculty: " + getNama();
    }
}

class Staff extends Employee {
     String title;
    
    public Staff(String nama, String alamat, String telepon, String email, String kantor, double gaji, Date dateRekrut, String title) {
        super(nama, alamat, telepon, email, kantor, gaji, dateRekrut);
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString() {
        return "Staff: " + getNama();
    }
}