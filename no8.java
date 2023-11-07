/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class no8 {
public static void main(String[] args) {
Scanner kerucut = new Scanner (System.in);
int r,t;
double v,l;
System.out.print("Masukkan jari-jari :");
r = kerucut.nextInt();
System.out.print("Masukkan tinggi :");
t = kerucut.nextInt();
v = 1*3.14*r*r*t/3 ;
l = 3.14*r*r + 3.14*r*r*t;
    System.out.println("Volume selimut kerucut ="+v);
    System.out.println("Luas selimut kerucut ="+l);





        
    }
    
}
