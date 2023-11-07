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

public class no7 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int x1 = 0;
        int i = 1;
        float jum = 0;
        double jumK = 0;
        System.out.print("Banyak data yang akan diolah : ");
        float xP = a.nextInt();

        while (i <= xP) {

            System.out.print("Data " + i);
            x1 = a.nextInt();
            jum += x1;
            jumK += x1 * x1;
            if (i == 1) {
                max = x1;

                min = x1;
            } else {
                if (x1 > max) {
                    max = x1;
                }
                if (x1 < min) {
                    min = x1;
                }

            }

            i++;
        }
        int rentang = max - min;
        double rerata = jum / xP;
        double var = (jumK - xP) * (rerata * rerata) / xP;
        double dev = Math.sqrt(var);
        System.out.println("Data terbesar = " + max);
        System.out.println("Data terkecil = " + min);
        System.out.println("Rentang Data = " + rentang);
        System.out.println("Rata-rata = " + rerata);
        System.out.println("Variansi = " + var);
        System.out.println("Devasi Standard = " + dev);
    }
}
