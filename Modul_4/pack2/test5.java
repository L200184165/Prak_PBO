/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

import pack1.PublicModifier;
/**
 *
 * @author dell
 */
public class test5 {
    public static void main(String[] args) {
        PublicModifier publicmodifier = new PublicModifier();
        publicmodifier.kali();
        publicmodifier.tambah();
        publicmodifier.kurang();
        publicmodifier.bagi();
        publicmodifier.rata();
    }   
    
}

/* Bisa diakses di method ini juga karena publicmodifier methodnya public so if its either in the other package 
unless they still can import so it will be called by the other */
