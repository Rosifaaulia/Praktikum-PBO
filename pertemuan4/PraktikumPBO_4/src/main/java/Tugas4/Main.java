/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Main {
    public static void main(String[] args) {
        Pekerja A1 = new Pekerja("Sean", 23, "Admin", 5000000);
        System.out.println(A1.toString());
        
        A1.setNama("Sean Gelael");
        System.out.println(A1.toString());
        
        //System.out.println(A1.nama);
        //System.out.println(A1.usia);
        //System.out.println(A1.pekerjaan);
    }
}
