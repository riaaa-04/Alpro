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
public class no2 {
public static void main(String[] args) {
Scanner bulan = new Scanner (System.in);
System.out.print("Masukkan angka");
int month = bulan.nextInt();
System.out.print("");
String bulString = bulan.next();
switch (month){
case 1 : bulString = "January";
         break;
case 2 : bulString = "February";
         break;
case 3 : bulString = "March";
         break;
case 4 : bulString = "April";
         break;
case 5 : bulString = "May";
         break;
case 6 : bulString = "June";
break;
case 7 : bulString = "July";
break;
case 8 : bulString = "August";
break;
case 9 : bulString = "September";
break;
case 10 : bulString = "October";
break;
case 11 : bulString = "November";
break;
case 12 : bulString = "December";
break;
}
System.out.println(bulString); 


    }
}
