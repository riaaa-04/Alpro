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
public class no7 {
public static void main(String[] args) {
Scanner fungsi = new Scanner (System.in);
int x;
double fx;
    System.out.print("Masukkan x :");
    x = fungsi.nextInt();
    fx = 5 + 6*x + Math.pow(8*x,2)+ Math.pow(9*x,3) + Math.pow(5*x,4);
    System.out.println("Nilai Fungsi X adalah ="+fx);
    
    
    
    
    
    }
    
}
