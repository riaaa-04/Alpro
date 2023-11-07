package javaapplication1;

import java.util.Scanner;

public class number2 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int jB;
        double dis, hD, hB;
        double hsbD, hsD;

        System.out.println("TOKO RAMAJU-MAJU");
        System.out.println();
        System.out.print("Jumlah barang : ");
        jB = key.nextInt();
        System.out.print("Harga barang : ");
        hB = key.nextDouble();
        hsbD = (hB * jB);
        dis = 20 / 100;
        hD = (20 * hsbD) / 100;
        hsD = (hB * jB - hD);
        System.out.println("Harga Sebelum Diskon = " + hsbD);
        System.out.println("Diskon = " + hD);
        System.out.println("Harga Setelah Diskon = " + hsD);

        System.out.println("----------------------");

    }

}
