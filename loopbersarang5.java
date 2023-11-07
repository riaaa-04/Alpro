
package loopbersarang1;

import java.util.Scanner;//Deklarasi import Scanner
public class loopbersarang5 {//Deklarasi Class
    public static void main(String[] args) { // Deklarasi metode main
        Scanner pascal = new Scanner (System.in);// Membentuk objek bernama pascal dari class Scanner
        System.out.print("Banyak baris : ");//Mencetak 'Banyak baris : '
        int no = pascal.nextInt(); // Membuat perinah untuk mengisi variabel no melalui keyboard
        int spasi = no; // Mengisi spasi dengan no
        int angka = 1 ;// Menyimpan angka 1 sebagai isi variabel angka
        for (int r = 0; r<=no; r++){ // Untuk r = 0, r lebih kecil sama dengan no, r = r+1
        
            for (int s = 0; s<=spasi; s++){// Untuk s = 0, s lebih kecil sama dengan spasi, s = s+1
                System.out.print(" ");//Mencetak spasi
            }//Akhir for
            angka = 1;// Menyimpan 1 sebagai isi variabel angka
            for ( int t = 0; t<=r ; t++) { // Untuk t = 0, t lebih kecil sama dengan r, t = t+1
                System.out.print(angka+ " ");//Mencetak isi variabel angka
            angka = angka *(r-t)/(t+1);//Menghitung hasil operasi angka *(r-t)/(t+1), lalu disimpan ke angka
            }//Akhir for
            spasi--;// spasi = spasi - 1
            System.out.println(""); //Mencetak spasi
        }//Akhir Class
    }//Akhir metode main
    
}
