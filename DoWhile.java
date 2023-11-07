
package dowhile;


import java.util.Scanner;

public class DoWhile {

    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Uts 1 :");
        double n1 = key.nextDouble();
        System.out.print("Uts 2 :");
        double n2 = key.nextDouble();
        System.out.print("Uas :");
        double n3 = key.nextDouble();

        double nT = (0.3*n1 + 0.3 * n2 + 0.4*n3);
do {
            if (nT >= 80) {
                System.out.println("Nilai final A");
            } else if (nT >= 65 && nT < 80) {
                System.out.println("Nilai final B");
            } else if (nT >= 55 && nT < 65) {
                System.out.println("Nilai final C");
            } else if (nT >= 50 && nT > 55) {
                System.out.println("Nilai final D");
            } else if (nT < 50) {
                System.out.println("Nilai final E");
            } break;
        } while (nT <= 100);
    }
}
