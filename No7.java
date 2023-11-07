package javaapplication1;

import java.util.Scanner;

public class No7 {

    public static void main(String[] args) {
        Scanner fungsi = new Scanner(System.in);
        int x;
        double fx;
        System.out.print("Masukkan X :  ");
        x = fungsi.nextInt();
        fx = (5 + 6 * x) + (Math.pow(8 * x, 2)) + (Math.pow(9 * x, 3) + (Math.pow(5 * x, 4)));
        System.out.println("Nilai fungsi x adalah =" + fx);

    }

}
