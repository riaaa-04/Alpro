package submeth1;

import java.util.Scanner;//Deklarasi import Scanner

public class submeth4 {//Deklarasi class

    public static void main(String[] args) {//Deklarasi metode main
        Scanner key = new Scanner(System.in);//Membentuk objek bernama key dari class Scanner
        int a;//Memesan memori integer bernama a 
        double x;//Memesan memori double bernama x

        System.out.println("Masukkan kecepatan awal (v0) = ");//Mencetak tulisan 'Masukkan kecepatan awal (v0) = '
        a = key.nextInt();
        System.out.println("Sudut     Jarak terjauh     Waktu tempuh     Titik tertinggi ");

        for (int i = 5; i < 100; i = i + 5) {
            x = (i * 22.0 / 7) / 180;
            System.out.println("" + i + "      " + j(i, a, x) + "     " + wT(a, i, x) + "     " + tM(a, i, x));

        }
    }

    static double j(int i, int a, double x) {
        double jarak = a * a * Math.sin(2 * x);
        return jarak;
    }

    static double wT(int a, int i, double x) {
        double waktu = (2 * a * Math.sin(x)) / 10;
        return waktu;
    }

    static double tM(int a, int i, double x) {
        double titik = a * Math.sin(x) * a * Math.sin(x) / 20;
        return titik;
    }
}
