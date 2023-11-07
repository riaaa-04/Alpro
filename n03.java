/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

public class n03 {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int kc = 0, sd = 0, be = 0;
        double gr;
        int c = 1;
        System.out.print("Jumlah mangga :");
        double jM = b.nextDouble();

        do {

            System.out.print("Berat mangga " + c + " :");

            gr = b.nextInt();
            c++;
            if (gr < 500) {
                System.out.println("BIASA");
                kc++;
            } else if (gr >= 500 && gr < 750) {
                System.out.println("BAGUS");
                sd++;
            } else if (gr >= 750) {
                System.out.println("UNGGUL");
                be++;
            }
        } while (gr <= 800);

        System.out.println("Dari Mangga yang ditimbang : ");
        System.out.println("Di ekspor : " + be + " buah");
        System.out.println("Di jual dalam negeri : " + sd + " buah");
        System.out.println("Di juice : " + kc + " buah");

    }

}
