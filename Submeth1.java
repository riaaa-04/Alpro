package submeth1;

import java.util.Scanner;//Deklarasi import Scanner

public class Submeth1 {//Deklarasi Class

    public static void main(String[] args) {//Deklarasi metode main
        Scanner sub = new Scanner(System.in);//Membentuk objek bernama sub dari class Scanner
        int n, r;//Memesan tempat di memori bernama n dan r bertipe integer
        long hasilKombinasi;//Memesan tempat di memori bernama hasilKombinasi bertipe long

        System.out.print("Masukkan n : ");//Mencetak tulisan 'Masukkan n :'
        n = sub.nextInt();//Membuat perintah untuk mengisi variabel n melalui keyboard
        System.out.print("Masukkan r : ");//Mencetak tulisan 'Masukkan r :'
        r = sub.nextInt();//Membuat perintah untuk mengisi variabel r melalui keyboard

        hasilKombinasi = faktorial(n) / faktorial(r) * faktorial(n - r);//Menghitung hasil operasi faktorial(n) / faktorial(r) * faktorial(n - r)
                                                                        //Kemudian disimpan ke hasilKombinasi
        System.out.println("Hasil kombinasi : " + hasilKombinasi);//Mencetak tulisan 'Hasil kombinasi, lalu disambung dengan menampilkan isi variabel hasilKombinasi

    }//Akhir main

    static long faktorial(int m) {//Membuat metode faktorial dengan parameter m
        int hasFak = 1;//Memesan memori hasFak bertipe integer, lalu menyimpan bilangan bulat 1 kedalamnya

        if (m == 0) {//Jika m sama dengan 0
            return 1;//Kembalikan 1
        } else {//Jika tidak

            for (int i = 1; i <= m; i++) {//Untuk i sama dengan 1, i lebih kecil sama dengan m, i = i+1
                hasFak = hasFak * i;//Menghitung hasil operasi hasFak * i, lalu disimpan ke hasFak
            }
            return hasFak;//Kembalikan hasFak
        } // akhir dari else

    }//Akhir metode
}//Akhir class
