package loopbersarang1;

import java.util.Scanner; // Deklarasi Import Scanner

public class loopbersarang2 { // Deklarasi Class

    public static void main(String[] args) { // Deklarasi Metode main
        Scanner age = new Scanner(System.in);//Membentuk objek bernama age dari class Scanner
        int b, usia, s, a, i, u, e, o; // Memesan tempat di memori bertipe integer
        System.out.print("Jumlah Penduduk : ");//Mencetak tulisan 'Jumlah Penduduk :'
        b = age.nextInt();//Membuat perintah untuk mengisi variabel b melalui keyboard

        a = 0;//Mengisi variabel a dengan 0
        i = 0;//Mengisi variabel b dengan 0
        u = 0;//Mengisi variabel c dengan 0
        e = 0;//Mengisi variabel d dengan 0
        o = 0;//Mengisi variabel e dengan 0
        
        for (s = 1; s <= b; s++) { //Untuk s = 1, s lebih kecil sama dengan b, s = s+1
            do { //Kerjakan
                System.out.print("Usia Warga " + s + " :");//Mencetak 'Usia Warga', lalu disambung dengan menampilkan isi variabel s
                usia = age.nextInt();//Membuat perintah untuk mengisi variabel usia melalui keyboard
            } while (!(usia >= 0 && usia <= 100));// Selama tidak (usia lebih besar sama dengan 0 dan usia lebih kecil sama dengan 100 
            if (usia >=0 && usia <= 20) { // Jika usia lebih besar sama dengan 0 dan usia lebih kecil sama dengan 20
                a++; // a = a+1
            }else if (usia >= 21 && usia <= 40){ //Lain jika usia lebih besar sama dengan 21 dan usia lebih kecil sama dengan 40
            i++; // i = i+1
            }else if (usia >=41 && usia <= 60){ //Lain jika usia lebih besar sama dengan 41 dan usia lebih kecil sama dengan 60
            u++; // u = u+1
            }else if (usia >=61 && usia <= 80){//Lain jika usia lebih besar sama dengan 61 dan usia lebih kecil sama dengan 80
            e++; // e = e+1
            }else if (usia >= 81 && usia <=100){//Lain jika usia lebih besar sama dengan 81 dan usia lebih kecil sama dengan 100
            o++; // o = o+1
            }//Akhir else if

        } // Akhir for
        System.out.println(""); //Mencetak spasi
        System.out.println("Distribusi usia "+s+" penduduk di atas adalah :");//Mencetak 'Distribusi usia' lalu disambung dengan menampilkan isi variabel s
                                                                             //lalu disambung dengan mencetak 'penduduk di atas adalah :'
        System.out.println(""); // Mencetak Spasi
        System.out.print("0-20\t :");// Mencetak '0-20\t :'
        for (s = 1 ; s<=a ; s++){ // Untuk s = 1, s lebih kecil sama dengan a, s = s+1
        System.out.print("*");//Mencetak '*'
        } //Akhir for
        System.out.println("");//Mencetak Spasi
        System.out.print("21-40\t :");//Mencetak '21-40\t :'
        for (s = 1 ;s<= i ; s++){//Untuk s = 1, s lebih kecil sama dengan i, s = s+1
        System.out.print("*");//Mencetak '*'
        }//Akhir for
        System.out.println("");//Mencetak Spasi
        System.out.print("41-60\t :");//Mencetak '41-60\t :'
        for (s =1 ; s<=u ; s++){ // Untuk s = 1, s lebih kecil sama dengan u, s = s+1
        System.out.print("*");//Mencetak '*'
        }//Akhir for
        System.out.println("");//Mencetak Spasi
        System.out.print("61-80\t :");//Mencetak '61-80\t :'
        for(s = 1; s<=e ; s++){ // Untuk s = 1, s lebih kecil sama dengan e,s = s+1
        System.out.print("*");//Mencetak '*'
        }// Akhir for
        System.out.println("");//Mencetak Spasi
        System.out.print("80-100\t :");//Mencetak '80-100\t :'
        for(s = 1; s<= o; s++){ // Untuk s = 1, s lebih kecil sama dengan o, s = s+1
        System.out.print("*");//Mencetak '*'
        }//Akhir for
        System.out.println("");// Mencetak Spasi
        
    }//Akhir Class

}//Akhir Metode main
