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
public class no9 {
public static void main(String[] args) {
Scanner kecepatan = new Scanner (System.in);
int v0,t,a;
double vT,sT;
System.out.print("Masukkan v0 :");
v0 = kecepatan.nextInt();
System.out.print("Masukkan t :");
t = kecepatan.nextInt();
System.out.print("Masukkan a :");
    a = kecepatan.nextInt();
vT = v0*a*t;
sT = v0*t + 1*a*t*t/2.0;

    System.out.println("Kecepatan total ="+vT);
    System.out.println("Jarak yg ditempuh ="+sT);




    }
   
}
