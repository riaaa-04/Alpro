
import java.util.Scanner;

 
public class no3 {

    
    public static void main(String[] args) {
        double luasTembok,hargaPerKaleng,jumlahCat,hargaTotal;
        Scanner input = new Scanner(System.in);
        System.out.println("luas tembok yang di cat:");
        luasTembok = input.nextDouble();
        System.out.print("harga per kaleng :");
        hargaPerKaleng = input.nextDouble();
        jumlahCat = Math.ceil (luasTembok/5.0);
        hargaTotal = jumlahCat*hargaPerKaleng;
        System.out.println("jumlah cat yang diperlukan = "+ jumlahCat);
        System.out.println("harga cat yang diperlukan= " + hargaTotal);
    }
    
}
