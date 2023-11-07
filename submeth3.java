package submeth1;

import java.util.Scanner;//Deklarasi Import Scanner

public class submeth3 {//Deklarasi Class

    public static void main(String[] args) {//Deklarasi Mtode main

        double keliling, luas, A, B, C, kelilingP;//Memesan memori double dengan nama keliling,luas,A,B,C, dan kelilingP
        int xa, ya, xb, yb, xc, yc;//Memesan memori integer dengan nama xa,ya,xb,yb,xc,dan yc
        Scanner tri = new Scanner(System.in);//Membentuk objek bernama tri dari class Scanner
        System.out.print("Masukan absis   A : ");//Mencetak tulisan 'Masukan absis A :'
        xa = tri.nextInt();//Membuat perintah untuk mengisi variabel xa melalui keyboard
        System.out.print("Masukan ordinat A : ");//Mencetak tulisan 'Masukan ordinat A :'
        ya = tri.nextInt();//Membuat perintah untuk mengisi variabel ya melalui keyboard
        System.out.print("Masukan absis   B : ");//Mencetak tulisan 'Masukan absis B :'
        xb = tri.nextInt();//Membuat perintah untuk mengisi variabel xb melalui keyboard
        System.out.print("Masukan ordinat B : ");//Mencetak tulisan 'Masukan ordinat B :'
        yb = tri.nextInt();//Membuat perintah untuk mengisi variabel yb melalui keyboard
        System.out.print("Masukan absis   C : ");//Mencetak tulisan 'Masukan absis C :'
        xc = tri.nextInt();//Membuat perintah untuk mengisi variabel xc melalui keyboard
        System.out.print("Masukan ordinat C : ");//Mencetak tulisan 'Masukan ordinat C :'
        yc = tri.nextInt();//Membuat perintah untuk mengisi variabel yc melalui keyboard

        A = jarak(xa, xb, ya, yb);//Memanggil metode jarak untuk menghitung sisi A
        B = jarak(ya, yb, xc, yc);//Memanggil metode jarak untuk menghitung sisi B
        C = jarak(xc, yc, xa, xb);//Memanggil metode jarak untuk menghitung sisi C
        System.out.println("Maka jarak antara absis X dengan ordinat Y = " + A);//Mencetak tulisan 'Maka jarak antara absis X dengan ordinat Y ='
                                                                                // lalu disambung dengan menampilkan isi variabel A
        System.out.println("Maka jarak antara ordinat Y dengan titik X = " + B);//Mencetak tulisan 'Maka jarak antara ordinat Y dengan titik X =' 
                                                                                //lalu disambung dengan menampilkan isi variabel B
        System.out.println("Maka jarak antara titik X dengan absis   X = " + C);//Mencetak tulisan 'Maka jarak antara titik X dengan absis   X =' 
                                                                                //lalu disambung dengan menampilkan isi variabel C

        keliling = kel(A, B, C);//Memanggil metode kel untuk menghitung keliling 
        System.out.println("Maka keliling dari segitiga                = " + keliling);//Mencetak tulisan 'Maka keliling dari segitiga =' 
                                                                                      //lalu disambungb dengan menampilkan isi variabel keliling 
        kelilingP = 0.5 * (keliling);//Menghitung hasil operasi 0.5 * (keliling), lalu disimpan ke kelilingP
        luas = luasnya(kelilingP, A, B, C);//Memanggil metode luasnya untuk menghitung luas
        System.out.println("Maka luas segitiga                         = " + luas);//Mencetak tulisan 'Maka luas segitiga ='    
                                                                                  //lalu disambung dengan menampilkan isi variabel luas
    }//Akhir metode main

    static double jarak(double xa, double xb, double ya, double yb) {//Membuat metode jarak dengan parameter double xa, double xb, double ya, double yb

        double jaraknya = Math.sqrt(Math.pow(xb - xa, 2)) + Math.sqrt(Math.pow(yb - ya, 2));//Menghitung hasil operasi Math.sqrt(Math.pow(xb - xa, 2)) 
                                                                                            //+ Math.sqrt(Math.pow(yb - ya, 2)),lalu disimpan ke jaraknya
                                                                                          
        return jaraknya;//kembalikan jaraknya
    }//akhir main

    static double kel(double A, double B, double C) {//Membuat metode kel dengan parameter double A, double B, double C
        double keliling = A + B + C;//Menghitung hasil operasi A + B + C lalu disimpan ke keliling
        return keliling;//kembalikan keliling
    }//akhir metode

    static double luasnya(double kelilingP, double A, double B, double C) {//Membuat metode luas dengan parameter double kelilingP,
                                                                          // double A, double B, double C
        double luas = Math.sqrt((kelilingP) * (kelilingP - A) * (kelilingP - B) * (kelilingP - C));//menghitung hasil operasi  Math.sqrt((kelilingP)* (kelilingP - A)
                                                                                                   //* (kelilingP - B) * (kelilingP - C), lalu disimpan ke luas
        return luas;//Kembalikan luas

    }

}
