
package forloop;

import java.util.Scanner; // Deklarasi import Scanner

public class Forloop { //Deklarasi Class

    public static void main(String[] args) { //Deklarasi Metode main
        Scanner my = new Scanner(System.in); // Membentuk objek bernama my dari kelas Scanner
        double jS = 0; // Memesan tempat di memori dengan nama jS lalu mengisinya dengan 0
        double jP = 0; // Memesan tempat di memori dengan nama jP lalu mengisinya dengan 0

        System.out.print("Banyak hambatan : "); // Cetak 'Banyak hambatan :'
        double res = my.nextDouble(); // Memesan tempat di memori bernama res,lalu membuat perintah untuk mengisi variabel res melalui keyboard

        for (int a = 1; a <= res;  a++) { // Untuk a = 1; a lebih kecil sama dengan res; a = a+1
            System.out.print("Hambatan " + a+" :"); //Cetak 'Hambatan' lalu disambung dengan menampilkan isi variabel a, lalu disambung lagi dengan mencetak :
            int rT = my.nextInt(); // Memesan tempat di memori dengan nama rT, lalu membuat perintah untuk mengisi variabel rT melalui keyboard
            
            jS+=rT; // Menghitung jS+rT lalu disimpan ke jS
            jP = jP+1.0/rT; // Menghitung jP+1.0/rT lalu disimpan ke jP
           
        } // Akhir dari for

           System.out.println("Pilih"); // Cetak 'Pilih'
           System.out.println("1.Rangkaian Seri"); // Cetak '1.Rangkaian Seri'
           System.out.println("2.Rangkaian Paralel");// Cetak '2.Rangkaian Paralel
           
            int code = my.nextInt(); // Memesan tempat di memori dengan nama code, lalu membuat perintah untuk mengisi variabel code melalui keyboard
            if (code == 1) { // Jika code sama dengan 1
                System.out.println("Rangkaian Seri dengan total hambatan : "+jS);// Cetak 'Rangkaian Seri dengan total hambatan' lalu disambung dengan menampilkan isi variabel jS
            } else if (code == 2) { // Lain jika code sama dengan 2
                System.out.println("Rangkaian Paralel dengan total hambatan : "+jP); // Cetak 'Rangkaian Paralel dengan total hambatan' lalu disambung dengan menampilkan isi variabel jP
            }// Akhir else if      
        
    } // Akhir Class

} // Akhir metode main
