package loopbersarang1;

import java.util.Scanner; //Deklarasi import Scanner

public class loopbersarang4 { // Deklarasi Class

    public static void main(String[] args) { // Deklarasi Metode main
        Scanner data = new Scanner(System.in);//Membentuk objek bernama data dari class Scanner

        int choose, sum = 0; // Memesan tempat di memori dengan nama choose dan sum, kemudian diisi dengan 0
        int b = 0, age, s, a = 0, i = 0, u = 0, e = 0, o = 0;// Memesan memori dan mengisinya dengan 0
        double jK = 0, var, dev, rata = 0;// Memesan tempat di memori lalu mengisinya dengan 0

        do { // Kerjakan
            System.out.println("Menu: ");//Mencetak tulisan 'Menu :'
            System.out.println("1.Memasukan data usia ");//Mencetak tulisan '1.Memasukan data usia'
            System.out.println("2.Rata-Rata ");//Mencetak tulisan '2.Rata-Rata'
            System.out.println("3.Deviasi standard ");// Mencetak tulisan '3.Deviasi standard'
            System.out.println("4.Diagram batang");//Mencetak tulisan '4.Diagram batang'
            System.out.println("5.Keluar");//Mencetak tulisan '5.Keluar'
            System.out.print("Menu yang dipilih : ");//Mencetak tulisan 'Menu yang dipilih :'
            choose = data.nextInt();

            switch (choose) { //Membuat percabangan switch
                case 1: // case pertama
                    System.out.print("Jumlah Penduduk : ");// Mencetak tulisan 'Jumlah Penduduk : '
                    b = data.nextInt();//Membuat perintah untuk mengisi variabel b melalui keyboard
                    for (s = 1; s <= b; s++) { //Untuk s = 1; s <= b; s++
                        do { // Kerjakan
                            System.out.print("Usia Warga " + s + " :");//Mencetak tulisan 'Usia Warga ', lalu disambung dengan menampilkan isi variabel s, 
                                                                      //lalu disambung lagi dengan ':'
                            age = data.nextInt();//Membuat perintah untuk mengisi variabel age melalui keyboard
                        } while (!(age >= 0 && age <= 100));//Selama !(age >= 0 && age <= 100)
                        if (age >= 0 && age <= 20) { //Jika age >= 0 && age <= 20
                            a++;// a = a+1
                        } else if (age >= 21 && age <= 40) {//Lain jika age >= 21 && age <= 40
                            i++;// i = i+1
                        } else if (age >= 41 && age <= 60) { //Lain jika age >= 41 && age <= 60
                            u++;// u = u+1
                        } else if (age >= 61 && age <= 80) {//Lain jika age >= 61 && age <= 80
                            e++;// e = e+1
                        } else if (age >= 81 && age <= 100) {//Lain jika age >= 81 && age <= 100
                            o++;// o = o+1
                        }//Akhir else if
                        sum = sum + age;//Mengitung hasil operasi sum + age lalu disimpan ke sum
                        jK = jK + (Math.pow(age, 2));//Menghitung hasil operasi jK + (Math.pow(age, 2)) lalu disimpan ke jK
                    }//Akhir for

                    break;//Perintah untuk mengakhiri case pertama
                case 2:// Case kedua
                    rata = sum / b; // Menghitung hasil operasi sum / b lalu disimpan ke rata
                    System.out.println("Rata-rata : " + rata);// Mencetak tulisan 'Rata-rata :' lalu disambung dengan menampilkan isi variabel rata 
                    break; //Perintah untuk mengakhiri case kedua
                case 3: // Case ketiga
                    var = (jK - sum * (Math.pow(rata, 2)) / sum);//Menghitung hasil opearsi (jK - sum * (Math.pow(rata, 2)) / sum), lalu disimpan  ke var
                    dev = (Math.sqrt(var));// Menghitung hasil operasi(Math.sqrt(var)), lalu disimpan ke dev
                    System.out.println("Deviasi standard : " + dev);//Mencetak tulisan 'Deviasi standard :', lalu disambung dengan menampilkan isi variabel dev
                    break;//Perintah untuk mengakhiri case ketiga
                case 4://Case keempat
                    System.out.println("Distribusi Usia" + b + " Penduduk diatas adalah : ");//Mencetak tulisan'Distribusi Usia',lalu disambung dengan menampilkan
                                                                                            //isi variabel b, llau disambung lagi dengan mencetak tulisan
                                                                                           //'Penduduk diatas adalah:'
                    System.out.print("0-20\t:");//Mencetak tulisan'0-20\t:'
                    for (s = 1; s <= a; s++) {//Untuk s = 1; s <= a; s++
                        System.out.print("*");//Mencetak '*'
                    }//Akhir for
                    System.out.println("");//Mencetak spasi

                    System.out.print("21-40\t:");//Mencetak tulisan'21-40\t:'
                    for (s = 1; s <= i; s++) {//Untuk s = 1; s <= i; s++
                        System.out.print("*");//Mencetak '*'
                    }//Akhir for
                    System.out.println("");//Mencetak spasi

                    System.out.print("41-60\t:");//Mencetak tulisan '41-60\t:'
                    for (s = 1; s <= u; s++) {//Untuk s = 1; s <= u; s++
                        System.out.print("*");//mencetak '*'
                    }//Akhir for
                    System.out.println("");//Mencetak spasi

                    System.out.println("61-80\t:");//Mencetak tulisan '61-80\t:'
                    for (s = 1; s <= e; s++) {//Untuk s = 1; s <= e; s++
                        System.out.print("*");//Mencetak '*'
                    }//Akhit for
                    System.out.println("");//Mencetak spasi

                    System.out.print("81-100\t:");//Mencetak tulisan '81-100\t:'
                    for (s = 1; s <= o; s++) {//Untuk s = 1; s <= o; s++ 
                        System.out.print("*");//Mencetak '*'
                    }//Akhir for
                    System.out.println("");//Mencetak spasi
                    break;//Perintah untuk mengakhiri case keempat
                case 5://Case kelima
                    System.out.println("Terimakasih");//Mencetak tulisan 'Terimakasih'
                    break;//erintah untuk mengakhiri case kelima

            }//Akhir switch

        } while (choose != 5);//Selama choose tidak sama dengan 5
    }//Akhir class

}//Akhir metode main
