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

public class no6 {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Banyak data yang akan diproses : ");
        float dP = data.nextInt();

        int a = 0;
        float rata,jum;
        jum = 0;
        rata = 0;
     

        while (a < dP) {
            a++;
            System.out.print("Data " + a);
            int d1 = data.nextInt();
            jum+=d1;
            rata = jum/dP;
           
                    }
        System.out.println("Rata-Rata = " +rata);

    }
}
