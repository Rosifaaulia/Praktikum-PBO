/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsiuts;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Main {
    public static void main(String[] args) {
        Produk laptop = new Elektronik("Laptop", 15000000, 3);
        System.out.println("1. Output Produk");
        laptop.tampilkanInfo();
        System.out.println(); //untuk memberi spasi kosong
    
        Pegawai rosifa = new PegawaiTetap("Rosifa", 30000000, 1000000);
        System.out.println("2. Output Pegawai");
        rosifa.tampilkanInfo();
        System.out.println();
        
        Produk kue = new Makanan("Kue", 85000, "01-10-2026");
        System.out.println("3. Output Polimorfisme");
        kue.tampilkanInfo();
        
        Pegawai sean = new PegawaiKontrak("Sean", 10000000, 12);
        System.out.println(); 
        sean.tampilkanInfo();
    }
}
