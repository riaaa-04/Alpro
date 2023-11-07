/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no5;

/**
 *
 * @author admin
 */

public class PraktikumPerulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    int liter = 0;
    int harga = 6500 ;
    System.out.println("Jumlah liter          Harga(RP)");
    System.out.println("===============================");
       
    
    while (liter < 20){
        liter++;
        harga = harga*liter;
    
        System.out.println (" " + liter+ " "+harga);
       
    }
    System.out.println("================================"); 
    }
    
}
