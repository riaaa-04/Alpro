/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alprouts;

/**
 *
 * @author admin
 */
import java.util.Scanner; // Mengimport fungsi Scanner
public class AlproUts { //Deklarasi kelas

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   // Deklarasi metode main
    Scanner dis = new Scanner (System.in);    // Membentuk objek bernama dis dari kelas Scanner
     String myN;                             // Memesan memori bertipe String 
     int noM;                               // Memesan memori bertipe integer noM = nomor mahasiswa
     double hGalon,hBotol,hBotolkecil,hGelas; // Memesan memori bertipe integer h= harga
     int jGalon,jBotol,jBotolkecil,jGelas;//Memesan memori bertipe integer j=jumlah
     double diskonGa,diskonBb,diskonBk,diskonG;//Memesan memori bertipe double
    
 
        System.out.print("Nama : "); //Cetak
        myN = dis.next();            
        System.out.print("NIM : ");
        noM = dis.nextInt();
        System.out.print("Jumlah Galon : ");
        jGalon = dis.nextInt();
        hGalon = jGalon*30000;
        diskonGa = hGalon*0.15;
        System.out.print("Jumlah Botol Besar : ");
        jBotol = dis.nextInt();
        hBotol = jBotol*5000;
        diskonBb = hBotol*0.12;
        System.out.print("Jumlah botol kecil: ");
        jBotolkecil = dis.nextInt();
        hBotolkecil = jBotolkecil*3000;
        diskonBk = hBotolkecil*0.10;
        System.out.print("Jumlah Gelas : ");
        jGelas = dis.nextInt();
        hGelas = jGelas*1000;
        diskonG = hGelas*0.20;
        double hTotal = (hGalon+hBotol+hBotolkecil+hGelas) - (diskonGa+diskonBb+diskonBk+diskonG);
        System.out.println("Jml  Kemasan  @    harga    discount ");
        System.out.println("=====================================");
        System.out.println("Galon     30000 " +hGalon +" " +diskonGa);
        System.out.println("B.Besar   5000  " +hBotol +" " +diskonBb);
        System.out.println("B.Kecil   3000  " +hBotolkecil +" "  +diskonBk );
        System.out.println("Gelas     1000  " +hGelas      + " " +diskonG);
        System.out.println("=================================================\n"
                + "TOTAL YANG DIBAYAR " + hTotal);   
        
    }
    
}
