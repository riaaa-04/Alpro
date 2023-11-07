/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

/**
 *
 * @author Basisdata
 */
import java.util.Scanner;

public class n01 {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a, b, c;
        double D, x1, x2;
        System.out.print("Nilai a :");
        a = d.nextInt();
        System.out.print("Nilai b : ");
        b = d.nextInt();
        System.out.print("Nilai c : ");
        c = d.nextInt();
        D = (b * b) - (4 * a * c);
        x1 = (-b + Math.sqrt(D)) / 2 * a;
        x2 = (-b - Math.sqrt(D)) / 2 * a;

        do {
            if (D == 0) {
                System.out.println("Memiliki satu akar bilangan real");
            } else if (D > 0) {
                System.out.println("Memiliki dua akar persamaan yakni : " + x1 + " dan " + x2);
            } else if (D < 0) {
                System.out.println("Tidak memiliki akar real");
            }break;
        }while(D>0);
    
    
    
    
    }

}
