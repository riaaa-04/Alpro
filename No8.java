package javaapplication1;

import java.util.Scanner;

public class No8 {

    public static void main(String[] args) {
        Scanner fDis = new Scanner(System.in);
        int sigma, x, mu;
        double fx;
        System.out.print("Masukkan sigma : ");
        sigma = fDis.nextInt();
        System.out.print("Masukkan x : ");
        x = fDis.nextInt();
        System.out.print("Masukkan mu  : ");
        mu = fDis.nextInt();

        double exponent = -0.5 * Math.pow((x - mu) / sigma, 2);
        double coefficient = 1 / (Math.sqrt(2 * Math.PI) * sigma);
        double result = coefficient * Math.exp(exponent);

        System.out.println("Nilai fungsi densitas pada distribusi normal: " + result);

    }

}
