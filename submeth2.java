package submeth1;

import java.util.Scanner; // Deklarasi import Scanner

public class submeth2 {//Deklarasi Class

    public static void main(String[] args){ //Deklarasi metode main
        Scanner c = new Scanner(System.in);//Membentuk objek bernama c dari Class Scanner
        int p;//Memesan tempat di memori dengan nama p bertipe integer
        System.out.print("Masukkan p : ");//Mencetak tulisan 'Masukkan p :'
        p = c.nextInt();//Membuat perintah untuk mengisi variabel p melalui keyboard

        for (int i = 0; i <= p; i++) { // Untuk i sama dengan 0, i lebih kecil sama dengan p, i = i+1

        for (int j = 0; j <= i; j++)//Untuk j sama dengan 0, j lebih kecil sama dengan i, j = j+1
        System.out.print("\t" + combination(i, j) + "\t");//Mencetak isi combination (  i,j)
            
        System.out.println();//Mencetak spasi

        }//Akhir dari for

    }//Akhir metode main

    static long faktorial(int m) {//Membuat metode dengan parameter m
        int hasFak = 1;//Memesan tempat di memori dengan nama hasFak, lalu mengisinya dengan 1
        if (m == 0) {//Jika m sama dengan 0
            return 1;//Kembalikan 1
        } else //Jika tidak 
          for (int a = 1; a <= m; a++) // Untuk a sama dengan 1, a lebih kecil sama dengan m, a = a+1
                hasFak = hasFak * a;//Menghitung hasil operasi hasFak * a, lalu disimpan ke hasFak
            
         return hasFak; //Kembalikan hasFak
    }//Akhir metode

      static long combination (int i, int j) {//Membuat metode dengan parameter (i dan j)
        long hasil = (faktorial(i) / faktorial(j) * faktorial(i - j));//Menghitung hasil operasi (faktorial(i) / faktorial(j) * faktorial(i - j))
                                                                      //lalu disimpan ke hasil
        return hasil;//Kembalikan hasil
    }//Akhir metode

}//Akhir Class
