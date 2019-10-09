/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author dell
 */
public class Tugas {
    String nama;
    String tanggalLahir;

    public Tugas() {
        nama = "Muhammad Irfan";
        tanggalLahir = "13 Juli 2000";
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println();
    }

    public Tugas(String nama, String tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println();
    }
    
}
