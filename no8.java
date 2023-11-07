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
import java.util.Scanner;

public class no8 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int gr = 0;
        int kc = 0;
        int sd = 0;
        int be = 0;
        
        int jM;
        int s = 1;
        int j1 = 0;
        System.out.print("Banyak mangga yang di proses : ");
        jM = key.nextInt();
        while (s <= jM) {
            System.out.print("Berat mangga " + s + " :");
            j1 = key.nextInt();
           s++;
           
        
            if (j1 < 200) {
              kc++;  

            } else if ((j1 >= 200 )&& (j1 < 600)) {
               sd++;

            } else if (j1 >= 600) {
               be++;
            }
        }    
        

        System.out.println("Dari mangga yang ditimbang : ");
        System.out.println("Kecil : " + kc + " buah ");
        System.out.println("Sedang : " + sd + " buah");
        System.out.println("Besar : " + be + " buah");
    }

}
