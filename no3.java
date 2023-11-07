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
public class no3 {
public static void main(String[] args) {
Scanner myDay = new Scanner (System.in);
System.out.print("Masukkan bulan :");
int bulan = myDay.nextInt();
System.out.print("");
String day = myDay.next();

switch (bulan){
case 1 : day = "31 hari";
break;
case 2 : day = "28 atau 29 hari";
break;
case 3 : day = "31 hari";
break;
case 4 : day = "30 hari";
break;
case 5 : day = "31 hari";
break;
case 6 : day = "30 hari";
break;
case 7 : day = "31 hari";
break;
case 8 : day = "31 hari";
break;
case 9 : day = "30 hari";
break;
case 10 : day = "31 hari";
break;
case 11 : day = "30 hari";
break;
case 12 : day = "31 hari";
break;
}
System.out.println(day);



 }
}
