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
public class no5 {
public static void main(String[] args) {   
Scanner bonus = new Scanner (System.in);
String I,II,III,IV;
String golongan;
    System.out.print("Golongan : ");
    golongan = bonus.next();
int gaji,masaKerja;
    System.out.print("Gaji pokok : ");
    gaji = bonus.nextInt();
    System.out.print("Masa kerja : ");
    masaKerja = bonus.nextInt();
double price;    
    switch (golongan){
    case "I"  :
       if(masaKerja>=0 && masaKerja<=10){ 
       price = gaji*0.5;
       System.out.println("Bonus Yang didapat = "+price);}
       else if (masaKerja>=11 && masaKerja<=20){
       price = gaji*0.6;
       System.out.println("Bonus yang didapat = "+price);}
       else if (masaKerja>=21 && masaKerja<=30){
       price = gaji*0.7;
       System.out.println("Bonus yang didapat = "+price);}
    break;
    case "II" :
        if (masaKerja>=0 && masaKerja<=10){
        price = gaji*0.6;
        System.out.println("Bonus yang didapat = "+price);}
        else if (masaKerja>=11 && masaKerja<=20){
        price = gaji*0.7;
        System.out.println("Bonus yang didapat = "+price);}
        else if (masaKerja>=21 && masaKerja<=30){
        price = gaji*0.8;
        System.out.println("Bonus yang didapat = "+price);}
    break;
    case "III":
        if (masaKerja>=0 && masaKerja<=10){
        price = gaji*0.7;
        System.out.println("Bonus yang didapat = "+price);}
        else if (masaKerja>=11 && masaKerja<=20){
        price = gaji*0.8;
        System.out.println("Bonus yang didapat = "+price);}
        else if (masaKerja>=21 && masaKerja<=30){
        price = gaji*0.9;
        System.out.println("Bonus yang didapat = "+price);}
    break;
    case "IV" :
        if (masaKerja>=0 && masaKerja<=10){
        price = gaji*0.8;
        System.out.println("Bonus yang didapat = "+price);}
        else if (masaKerja>=11 && masaKerja<=20){
        price = gaji*0.9;
        System.out.println("Bonus yang didapat = "+price);}
        else if (masaKerja>=21 && masaKerja<=30){
        price = gaji*1.0;
        System.out.println("Bonus yang didapat = "+price);}
    break;
    default:
    System.out.println("Bukan pegawai");
        
        
        
       
       
    
    }

}
}