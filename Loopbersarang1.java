
package loopbersarang1;

import java.util.Scanner;// Deklarasi import Scanner

public class Loopbersarang1 { // Deklarasi kelas

    public static void main(String[] args) { // Deklarasi metode main
        Scanner key = new Scanner(System.in); // Membentuk objek bernama key dari kelas Scanner

        System.out.print("Banyak baris dan kolom : "); // Mencetk tulisan 'Banyak baris dan kolom :'
        int N = key.nextInt();//Memesan tempat di memori bernama N,lalu membuat perintah untuk mengisi variabel N melalui keyboard

        for (int j = 1; j <= N; j++) { //  Untuk j = 1 ; j lebih kecil sama dengan N; j = j+1
            for (int i = 1; i <= N; i++) { // Untuk i = 1 ; 1 lebih kecil sama dengan N; i = i+1
                if (i == j) { // Jika i sama dengan j
                    System.out.print(1); // Mencetak angka 1
                } else { // Jika tidak
                    System.out.print(0); // Mencetak angka 0
                } // Akhir dari else
            } // akhir dari for kedua
            System.out.println();// Mencetak spasi

        } // Akhir for pertama

    } // Akhir Class
} // akhir metode main
