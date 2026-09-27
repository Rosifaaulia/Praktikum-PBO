/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author ASUS -REYZEN 3
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    public List<Produk> daftarProduk = new ArrayList<>();
    
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
    
    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }
}
