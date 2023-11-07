package loopbersarang1;
public class loopbersarang3 { // Deklarasi Class
    public static void main(String[] args) {//Deklarasi metode main
    
        for (int jam = 1; jam <= 12; jam++) {//Untuk jam = 1, jam lebih kecil sama dengan 12, jam = jam +1
            for (int menit = 1 ;menit<=60; menit++) {//Untuk menit = 1, menit lebih kecil sama dengan 60, menit = menit +1
                System.out.print(" Detik : ");//Mencetak 'Detik :'
            
           for (int detik = 1; detik <= 60; detik++) { //Untuk detik = 1,detik lebih kecil sama dengan 60, detik = detik +1
                System.out.print(detik + " "); //Mencetak isi variabel detik
           }//Akhir for
        System.out.println(" ");//Mencetak spasi
        System.out.println("Menit : "+menit);//Mencetak 'Menit : ' lalu disambung dengan mencetak isi variabel menit
        }//Akhir for
             System.out.println("Jam : "+jam);//Mencetak 'Jam :' lalu disambung dengan mencetak isi variabel jam
            System.out.println("");//Mencetak Spasi
        }//Akhir for
    }//Akhir Class
}//Akhir metode main

