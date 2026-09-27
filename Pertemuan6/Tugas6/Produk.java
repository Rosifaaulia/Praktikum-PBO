/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Produk {
    public String nama;
    public double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public double hitungDiskon() {
        return 0; //default: kalau ga di-override, dianggap tidak ada diskon
    }
    
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}
