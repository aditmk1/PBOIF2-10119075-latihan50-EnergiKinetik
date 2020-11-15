/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan50.energikinetik;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan energi kinetik
 */

public class PBOIF210119075Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bola objBola = new Bola(145, 25);
        
        objBola.tampilData(objBola.getMassa(), objBola.getKecepatan());
    }
    
}

