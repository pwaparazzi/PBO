/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritante_ariantias.Soal2;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {
        Person person = new Person("Nabil Mumtaz", "Jl. Ramah No.7, Pondok Rajeg", "082114120548", "naablm27@gmail.com");
        Student student = new Student("Fairuz Abrar", "Jl. Ramah No.12, Pondok Rajeg", "088192028402", "fairuzabrarr@gmail.com", Student.Senior);
        Date dateHired = new Date(2024, 04, 27);
        Employee employee = new Employee("Iqbal Hafidz", "Jl. Ramah No.8, Pondok Rajeg", "080382938293", "hafidzbal@gmail.com", "Universitas Pendidikan Indonesia", 2500000, dateHired);
        Faculty faculty = new Faculty("Dinda Maulida", "Jl. Ramah No.1, Pondok Rajeg", "08192736492", "maulidadinda@gmail.com", "Institut Teknologi Bandun", 7500000, dateHired, "8am-2pm", "Dosen");
        Staff staff = new Staff("Zahin Malik", "Jl. Ramah No.3, Pondok Rajeg", "084816395620", "zahinmalik@gmail.com", "Universitas Indonesia", 8500000, dateHired, "Dekan");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}