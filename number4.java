package javaapplication1;

import java.util.Scanner;

public class number4 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double u1, u2, u3;
        double nF;
        System.out.print("UTS 1 : ");
        u1 = key.nextDouble();
        System.out.print("UTS 2 : ");
        u2 = key.nextDouble();
        System.out.print("UAS : ");
        u3 = key.nextDouble();
        nF = ((u1 * 30 / 100) + (u2 * 30 / 100) + (u3 * 49 / 100));
        System.out.println("NILAI FINAL = " + nF);

    }

}
