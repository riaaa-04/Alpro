package javaapplication1;

import java.util.Scanner;

public class number3 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double n1, n2, n3;
        double rataRata;
        System.out.println("SD BHINEKA");
        System.out.print("Tugas 1 = ");
        n1 = key.nextDouble();
        System.out.print("Tugas 2 = ");
        n2 = key.nextDouble();
        System.out.print("Tugas 3 = ");
        n3 = key.nextDouble();
        rataRata = (n1 + n2 + n3) / 3;
        System.out.println("-------------");
        System.out.println("Rata-Rata = " + rataRata);
    }

}
