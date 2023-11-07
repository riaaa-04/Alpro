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
import java.util.Scanner;
public class Alpro2 {
public static void main(String[] args) {
Scanner suhu = new Scanner (System.in);
double celcius,reamur,fahrenheit;
double rC,rR,rF;
int kode;
String name;
int noM;
    System.out.println("Program konversi suhu oleh :");
    System.out.print("Nama :");
    name = suhu.next();
    System.out.print("NIM :");
    noM = suhu.nextInt();
    System.out.println("Menu \n"
            + "1. Celcius"
            + "2. Fahrenheit"
            + "3. Reamur");
    System.out.println(" Pilih ?");
    kode = suhu.nextInt();
    
     System.out.println("Masukkan suhu Celcius ");
     celcius = suhu.nextInt();
     
     
     if (kode==1){
         reamur = (4.0/5.0)*celcius;
         System.out.println("Suhu Reamur : "+reamur);
         fahrenheit = (9.0/5.0)*celcius+32;
         System.out.println("Suhu Fahrenheit : "+fahrenheit);}
     System.out.println("Masukkan suhu Reamur ");
     reamur = suhu.nextDouble();
     
     
     if (kode == 2){
      celcius = (5.0/4.0)*reamur;
        System.out.println("Suhu Celcius : "+celcius);
      fahrenheit = (9.0/4.0)*reamur+32;
        System.out.println("Suhu Fahrenheit : "+fahrenheit);}
    
    System.out.println("Masukkan suhu Fahrenheit");
    fahrenheit = suhu.nextDouble();
    
    if (kode == 3){
    celcius = (5.0/9.0)*(fahrenheit-32);
    System.out.println("Suhu celcius : "+celcius);}
    reamur = (4.0/9.0)*(fahrenheit-32);
    System.out.println("Suhu reamur : "+reamur);    
        
        
        
        
    }
  
}
