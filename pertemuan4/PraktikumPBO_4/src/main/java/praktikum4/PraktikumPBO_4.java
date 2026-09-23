/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class PraktikumPBO_4 {
        public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Alphard", 180, "Bensin");
        mobil.tampilkanInfoKendaraan();
        
        mobil.setNama("Fortuner");
        mobil.tampilkanInfoKendaraan();
    }
}
