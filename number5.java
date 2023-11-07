package javaapplication1;

import java.util.Scanner;

public class number5 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int tB;
        double bI;
        String myN;

        System.out.println("PROGRAM BERAT IDEAL");
        System.out.print("Nama Saya : ");
        myN = key.next();
        System.out.print("Tinggi Saya(cm) : ");
        tB = key.nextInt();
        bI = tB - 100;
        System.out.println("Berat ideal saya adalah (kg) : " + bI);

    }

}
