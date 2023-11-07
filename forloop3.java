
package forloop;

import java.util.Scanner; // Deklarasi import Scanner

public class forloop3 { // Deklarasi Class

    public static void main(String[] args) { // Deklarasi metode main
        Scanner r = new Scanner(System.in); // Membentuk objek bernama r dari class Scanner
        int bA, akhir, sekarang, fibro; // Memesan tempat di memori dengan nama bA,akhir,sekarang,dan fibro
        System.out.print("Banyak bilangan : ");//Cetak 'Banyak bilangan :'
        bA = r.nextInt();//Membuat perintah untuk mengisi variabel bA mellaui keyboard
        akhir = 1; // Mengisi variabel akhir dengan 1
        sekarang= 1;// Mengisi variabel sekarang dengan 1
        fibro = 1;// Mengisi variabel fibro dengan 1
        for (int s = 1; s <= bA; s++) { // Untuk s = 1 ; s lebih kecil sama dengan bA; s= s+1
            System.out.print(sekarang+" ,"); // Mencetak isi variabel sekarang, lalu disambung dengan mencetak ,
            fibro = akhir+sekarang;// Menghitung akhir+sekarang lalu disimpan ke fibro
            akhir = sekarang; // Akhir sama dengan sekarang
            sekarang= fibro;// Sekarang sama dengan fibro
        } // Akhir dari for
    }//Akhir Class
}//Akhir metode main
