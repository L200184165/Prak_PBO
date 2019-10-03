/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

/**
 *
 * @author LABRPL-28
 */
public class ParamConstructor {
    String nama, nim;
    int semester;

public ParamConstructor (String nama, int semester, String nim) {
    this.nama = nama;
    this.semester = semester;
    this.nim = nim;
}

public void info() {
    System.out.println("Nama : " + nama + "\nNim :" + nim +"\nSemester : " + semester);
}
    
}
