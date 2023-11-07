
import java.util.Scanner;


public class no4 {

   
    public static void main(String[] args) {
        Scanner key =new Scanner(System.in);
        double j,hargaB,rataPerKilo,biayaP,biayaT,bpkp;
        System.out.println("biaya pengguna kendaraan per hari");
        System.out.print("jarak(km) : ");
        j=key.nextDouble();
        System.out.print("harga bensin : ");
        hargaB=key.nextDouble();
        System.out.print("rata rata per kilo :");
        rataPerKilo=key.nextDouble();
        System.out.print("biaya parkir :");
        biayaP= key.nextDouble();
        System.out.print("biaya tol:");
        biayaT=key.nextDouble();
        bpkp=j+hargaB+rataPerKilo+biayaP+biayaT;
        System.out.println("biaya yang dibutuhkan:" + bpkp);
    }
    
}
