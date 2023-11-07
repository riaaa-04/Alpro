/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik4;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Praktik4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner akar = new Scanner (System.in);
    double a,b,c;
    double D,x1,x2;
        System.out.print("Masukkan a :");
        a = akar.nextDouble();
        System.out.print("Masukkan b :");
        b = akar.nextDouble();
        System.out.print("Masukkan c :");
        c = akar.nextDouble();
        D = b*b-4*a*c;
        x1 = (-b + Math.sqrt (D))/2*a;
        x2 = (-b - Math.sqrt (D))/2*a;
        
        if (D==0){
        System.out.println("Memiliki satu akar bilangan real");}
        else if (D>0){
        System.out.println("memiliki dua akar persamaan yakni :" +x1 + " dan " +x2);}
        else if (D<0){
        System.out.println("Tidak memiliki akar real");}
        
        
        
        
        
        
    }
    
}
