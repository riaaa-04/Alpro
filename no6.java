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
public class no6 {
public static void main(String[] args) {
Scanner segitiga = new Scanner (System.in);
int xA,xB,xC,yA,yB,yC;
double s,l,a,b,c,k;

    System.out.print("Masukkan absis a :");
    xA = segitiga.nextInt();
    System.out.print("Masukkan ordinat a :");
    yA = segitiga.nextInt();
    System.out.print("Masukkan absis b :");
    xB = segitiga.nextInt();
    System.out.print("Masukkan ordinat b :");
    yB = segitiga.nextInt();
    System.out.print("Masukkan absis c :");
    xC = segitiga.nextInt();
    System.out.print("Masukkan ordinat c :");
    yC = segitiga.nextInt();
    
    a = Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    b = Math.sqrt ((xC-xB)*(xC-xB)+(yC-yB)*(yC*yB));
    c = Math.sqrt ((xA-xC)*(xA-xC)+(yA-yC)*(yA-yC));
    k = a+b+c/2.0;
    s = 1*k/2.0;
    l = Math.sqrt (s*(s-a)*(s-b)*(s-c));
    
    System.out.println("Titik A ="+a);
    System.out.println("Titik B ="+b);
    System.out.println("Titik c ="+c);
    System.out.println("Keliling segitiga ="+k);
    System.out.println("setengah kelilng segitiga ="+s);
    System.out.println("Luas segitiga ="+l);
    
    
    









}
}
