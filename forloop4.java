package forloop;

import java.util.Scanner;//Deklarasi import Scanner

public class forloop4 {//Deklarasi Class

    public static void main(String[] args) {//Deklarasi metode main
        Scanner nilai = new Scanner(System.in);//Membentuk objek bernama nilai dari class Scanner

        double D, x1, x2;//Memesan tempat di memori dengan nama D,x1,dan x2
        double a, b, c;//Memesan tempat di memori dengan nama a,b,dan c
        double y, awal, akhir;// Memesan tempat di memori dengan nama y,awal,dan akhir

        System.out.print("Koefisien a : ");// Mencetak tulisan 'Koefisien a :'
        a = nilai.nextDouble();//Membuat perintah untuk mengisi variabel a melalui keyboard
        System.out.print("Koefisien b : ");//Mencetak tulisan 'Koefisien b :'
        b = nilai.nextDouble();//Membuat perintah untuk mengisi variabel b melalui keyboard
        System.out.print("Koefisien c : ");//Mencetak tulisan 'Koefisien c:'
        c = nilai.nextDouble();//Membuat perintah untuk mengisi variabel c melalui keyboard

        D = (b * b) - (4 * a * c);// Menghitung hasil operasi (b * b) - (4 * a * c) lalu disimpan ke D

        if (D > 0) { // Jika D lebih besar 0
            x1 = (-b + Math.sqrt(D)) / 2 * a; //Menghitung hasil operasi (-b + Math.sqrt(D)) / 2 * a, lalu disimpan ke x1
            x2 = (-b - Math.sqrt(D)) / 2 * a;// Menghitung hasil operasi (-b - Math.sqrt(D)) / 2 * a, lalu disimpan ke x2
            if (x1 < x2) { // Jika x1 lebih kecil x2
                awal = x2; // Mengisi variabel awal dengan x2
                akhir = x1;// Mengisi variabel akhir dengan x1
            } else { // Jika tidak 
                awal = x2;// Mengisi variabel awal dengan x2
                akhir = x1;//Mengisi variabel akhir dengan x1

                System.out.println("Dari persamaan  y = a * i * i + b * 1 + c; ");//Mencetak tulisan 'Dari persamaan  y = a * i * i + b * 1 + c; '
                System.out.println("Akar-Akarnya adalah : " + x1 + " dan " + x2);//Mencetak tulisan 'Akar-Akarnya adalah :', lalu disambung dengan,
                //menampilkan isi variabel x1,lalu diambung dengan mencetak tulisan 'dan' 
                //Lalu disambung lagi dengan menampilkan isi variabel x2
                System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah :");//Mencetak tulisan'Nilai y untuk beberapa x 
                //antara akar pertama dan kedua adalah :'
                for (double i = awal; i <= akhir; i = i + 0.25) {//Untuk i= awal; i lebih kecil sama dengan akhir ; i = 1+0.25
                    y = a * i * i + b * 1 + c;// Menghitung hasil operasi a * i * i + b * 1 + c, lalu disimpan ke y

                    System.out.println("-----------------------");//Mencetak; '-----------------------'

                    System.out.println("X = " + i + " Y = " + y);//Mencetak X =, lalu disambung dengan menampilkan isi variabel 1, kemudian disambung lagi dengan 
                    //mencetak Y =, kemudian disambung dengan menampilkan isi variabel y

                }//Akhir dari for
            }//Akhir dari else
        } else if (D <= 0) { // Lain jika D lebih kecil sama dengan 0
            x1 = (-b + Math.sqrt(D)) / 2 * a; // Menghitung hasil operasi (-b + Math.sqrt(D)) / 2 * a,lalu disimpan ke x1
            System.out.println("Memiliki 1 akar persamaan yakni: " + x1);//Mencetak tulisan 'Memiliki 1 akar persamaan yakni:'
                                                                        //disambung dengan menampilkan isi variabel x1
        } else { // Jika tidak 
            System.out.println("Salah masukan");// Mencetak tulisan 'Salah masukan'
        }//Akhir else

    }//AKhir Class
}//Akhir metode main
