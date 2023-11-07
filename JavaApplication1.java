package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int jumlahMakan, jumlahLauk, jumlahMinum;

        System.out.println("WARUNG MAKAN RAPAYAUPAYAU");
        System.out.println();
        System.out.print("Jumlah Makan : ");
        jumlahMakan = key.nextInt();
        System.out.print("Jumlah lauk : ");
        jumlahLauk = key.nextInt();
        System.out.print("Jumlah minum : ");
        jumlahMinum = key.nextInt();
        double hargaTotal = jumlahMakan * 8000 + jumlahMinum * 2000 + jumlahLauk * 3000;
        System.out.println("-------------------------");
        System.out.println(" Harga Total = " + hargaTotal);

    }

}
