/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class no4 {
public static void main(String[] args) {
Scanner baju = new Scanner(System.in);
System.out.print("Masukkan ukuran");
String Ukuran = baju.next();
String S,M,L,XL,XXL;
System.out.print("masukkan jumlah barang");
int jumlah = baju.nextInt();
int total;
switch (Ukuran){
case "S" :
total  = jumlah*30000 ;    
System.out.println("Harga total = "+total);
break;
case "M":
total = jumlah*38000 ;
System.out.println("Harga total= "+total);
break;
case "L" :
total = jumlah*45000;
System.out.println("Harga total = "+total);
break;
case "XL" :
total = jumlah*50000;
System.out.println("Harga total= "+total);
break;
case "XXL" :
total = jumlah*60000;
System.out.println("Harga total = "+total);
default :
System.out.println("Barang tidak tersedia");
}

    

        
        
        
        
    }
    
    
}
