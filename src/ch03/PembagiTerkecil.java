package ch03;
import java.util.Scanner;
public class PembagiTerkecil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Angka");
            int angka = sc.nextInt();

        System.out.println("Pembagi Terkecil dari angka " +angka+ ", Selain 1 dan 2 adalah : ");

        for (int i = 3; i <= angka; i++) {
            if(angka % i == 0) {

                System.out.printf("%d ", i );

            }
        }
    }
}
