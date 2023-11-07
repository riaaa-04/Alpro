package array;

import java.util.Scanner;//Deklarasi import Scanner

public class Array {//Deklarasi class

    public static void main(String[] args) {//Deklarasi metode main
        int i, n, max = 0, min = 0, jum = 0;//Memesan tempat di memori bernama i,n,max,min,dan jum bertipe integer, lalu menyimpan bilangan bulat 0 ke max,min,dan jum
        int[] skor;//membentuk array skor bertipe integer
        double rata = 0;//memesan tempat double di memori dengan nama rata, lalu menyimpan 0 sebagai isinya
        Scanner key = new Scanner(System.in);//membentuk objek bernama key dari class Scanner

        System.out.print("Masukkan elemen array : ");//mencetak tulisan 'Masukkan elemen array :'
        n = key.nextInt();//membuat perintah untuk mengisi variabel n melalui keyboard
        skor = new int[n];//membuat perintah untuk membentuk objek array dengan n elemen
        System.out.println("Masukkan " + n + " data bulat : ");//Mencetak tulisan 'Masukkan", lalu disambung dengan menampilkan isi variabel n, lalu disambung lagi dengan mencetak tulisan 'data bulat'

        for (i = 0; i <= skor.length ; i++) {//Untuk i = 0; i lebih kecil sama dengan n,i = i+1
            System.out.print("Data ke " + (i + 1) + " :");//mencetak tulisan 'Data ke' lalu disambung dengan menampilkan isi variabel i+1, lalu disambung lagi dengan mencetak ':'
            skor[i] = key.nextInt();//membuat perintah untuk mengisi elemen array skor melalui keyboard
        } // akhir for 

        for (i = 0; i <= skor.length; i++) {//Untuk i = 0; i lebih kecil sama dengan n,i = i+1
            jum = jum + skor[i];//menghitung hasil operasi jum + skor[i],lalu disimpan ke jum
            if (skor[i] == 1) {//jika skor[i] sama dengan 1
                max = skor[i];//max sama dengan skor[i]
                min = skor[i];//min sama dengan skor [i]
            }//akhir if
            else {//Jika tidak
                if (skor[i] > max) {//jika skor[i] lebih besar max
                    max = skor[i];//max sama dengan skor[i];
                }//akhir if
                if (skor[i] <= min) {//jika skor[i] lebih kecil sama dengan min
                    min = skor[i];//min = skor [i]
                }//akhir if

            }//akhir else 

        }// akhir for
        rata = jum / n;//menghitung hasil operasi jum/n, lalu disimpan ke rata
        System.out.println("Nilai maksimum : "+max);//mencetak tulisan 'Nilai maksimum' lalu disambung dengan menampilkan isi variabel max
        System.out.println("Nilai minimum : "+min);//mencetak tulisan 'Nilai minimum' lalu disambung dengan menampilkan isi variabel min
        System.out.println("Rata-rata: "+rata);// mencetak tulisan 'Rata-rata' lalu disambung dengan menampilkan isi variabel rata
    }

}
