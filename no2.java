
import java.util.Scanner;

public class no2 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double tahun21, pertumbuhan,n, m;
        int tahun;

        tahun21 = 271349989;
        pertumbuhan = 0.011;
        System.out.print("Masukan tahun : ");
        tahun = key.nextInt();
        n = tahun-2021;
        double pN = tahun21*Math.pow(1+pertumbuhan, n);
      

        System.out.println("jumlah penduduk pada tahun " + tahun + " adalah : " + pN);
    }

}
