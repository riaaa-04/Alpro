
import java.util.Scanner;


public class no1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double imt,b,t;
        System.out.println("indeks masa tubuh");
        
        System.out.print("berat(kg) : ");
        b = keyboard.nextDouble();
        System.out.print("tinggi (m) : ");
        t = keyboard.nextDouble();
        imt= Math.ceil (b/(t*t));
        System.out.println("indeks masa tubuh adalah : " + imt);
        
    }
}
