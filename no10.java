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
public class no10 {
public static void main(String[] args) {
Scanner fDis = new Scanner (System.in);
double sigma,x,mu;
double fx,e;
    System.out.print("Masukkan sigma :");
    sigma = fDis.nextDouble();
    System.out.print("Masukkan x :");
    x = fDis.nextDouble();
    System.out.print("Masukkan Mu :");
    mu = fDis.nextDouble();
     e = 2.71828;
    fx = 1.0/mu*(Math.sqrt(2*Math.PI))* e*(Math.sqrt(Math.pow(x-mu/sigma,2)));
  
    System.out.println("Nilai fungsi x adalah ="+fx);
    



}
    
}
