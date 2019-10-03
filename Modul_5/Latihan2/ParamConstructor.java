/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author LABRPL-28
 */
public class ParamConstructor {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe; 
    double hargaJual;
    
public ParamConstructor() {
    System.out.println("hello world");
}

public ParamConstructor(String namaPengarang, String judulBuku) {
    this.namaPengarang = namaPengarang;
    this.judulBuku = judulBuku;
    System.out.println("Nama pengarang : " + this.namaPengarang);
    System.out.println("Judul Buku : " + this.judulBuku);
}

public ParamConstructor(String namaPengarang, String judulBuku, int tahunTerbit) {
    this.namaPengarang = namaPengarang;
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    System.out.println("Nama pengarang : " + this.namaPengarang);
    System.out.println("Judul Buku : " + this.judulBuku);
    System.out.println("Tahun terrbit : " + this.tahunTerbit);
}

public ParamConstructor(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe) {
    this.namaPengarang = namaPengarang;
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.cetakanKe = cetakanKe;
    System.out.println("Nama pengarang : " + this.namaPengarang);
    System.out.println("Judul Buku : " + this.judulBuku);
    System.out.println("Tahun terrbit : " + this.tahunTerbit);
    System.out.println("Cetakan ke : "+ this.cetakanKe);
}

public ParamConstructor(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
    this.namaPengarang = namaPengarang;
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.cetakanKe = cetakanKe;
    this.hargaJual = hargaJual;
    System.out.println("Nama pengarang : " + this.namaPengarang);
    System.out.println("Judul Buku : " + this.judulBuku);
    System.out.println("Tahun terrbit : " + this.tahunTerbit);
    System.out.println("Cetakan ke : "+ this.cetakanKe);
    System.out.println("Harga Jual : " + this.hargaJual);
}
public static void main (String[] args){
ParamConstructor a = new ParamConstructor();
ParamConstructor b = new ParamConstructor("irfan", "hacking");
ParamConstructor c = new ParamConstructor("irfan", "hacking", 2019);
ParamConstructor d = new ParamConstructor("irfan", "hacking", 2019, 10);
ParamConstructor e = new ParamConstructor("irfan", "hacking", 2019, 10, 100.000);


    
}











    
    
}
