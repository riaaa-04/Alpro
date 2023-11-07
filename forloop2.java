
 
package forloop;
import java.util.Scanner; // Deklarasi import Scanner
public class forloop2 { // Deklarasi clas
    public static void main(String[] args) { // Deklarasi metode main
     Scanner data = new Scanner (System.in); // Membentuk objek bernama data dari class Scanner
        double jK = 0; // Memesan tempat di memori dengan nama jK, lalu mengisinya dengan 0
        double jA = 0;// Memesan tempat di memori dengan nama jA, lalu mengisinya dengan 0
        double jD = 0;// Memesan tempat di memori dengan nama jD, lalu mengisinya dengan 0
        System.out.print("Banyak Data :"); // Cetak 'Banyak Data :'
        double bD = data.nextDouble(); // Memesan tempat di memori dengan nama bD,lalu membuat perintah untuk mengisi variabel bD melalui keyboard
        
       for (int i = 1; i <= bD; i++){ // Untuk i = 1; i lebih kecil sama dengan bD ; i = i+1
           System.out.print("Data "+i+ " :");// Cetak 'Data', lalu disambung dengan menampilkan isi variabel i, kemudian disambung lagi dengan mencetak :
           int mD = data.nextInt(); // Memesan  tempat di memori dengan nama mD,lalu membuat perintah untuk megisi variabel mD melalui keyboard
           jK+=mD*mD;// Menghitung jK+mD*mD,lalu disimpan ke jK
           jA+=Math.sqrt(mD);// Menghitung jA+Math.sqrt(mD),lalu disimpan ke JA
           jD+=1.0/mD;// Menghitung jD+1.0/mD. lalu disimpan ke jD
       }
        System.out.println("Jumlah Kuadrat data = "+jK);// Cetak 'Jumlah Kuadrat data =', lalu dismabung dengan menampilkan isi variabel jK
        System.out.println("Jumlah akar data = "+jA);//Cetak 'Jumlah akar data =', lalu disambung dengan menampilkan isi variabel jA
        System.out.println("Jumlah 1/data = "+jD);// Cetak 'Jumlah 1/data =', lalu disambung dengan menampilkan isi variabel jD
    } // Akhir Metode main
    
    
}// akhir class
