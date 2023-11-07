package jenny;

public class No5 {

    public static void main(String[] args) {
        double kecepatan, percepatan, jarak, detik;
        kecepatan = 15;
        percepatan = 10;
        detik = 120;
        jarak = kecepatan * detik + 0.5 * percepatan * detik * detik;

        System.out.println("Jarak yang ditempuh ketika kecepatan awal " + kecepatan + " adalah = " + jarak);

    }

}
