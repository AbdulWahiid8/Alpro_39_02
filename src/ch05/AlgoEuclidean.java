package ch05;
import java.util.Scanner;
public class AlgoEuclidean {
    public static void main(String[] args) {

        int m, n, r;

        Scanner input = new Scanner(System.in);

        System.out.println("Mencari FPB (Algoritma Euclidean)");
        System.out.println("=================================");

        System.out.print("Masukkan Nilai 1 : ");
        m = input.nextInt();

        System.out.print("Masukkan Nilai 2 : ");
        n = input.nextInt();

            r = m % n;
            while ( r != 0) {
                 m = n;
                 n = r;
                  r = m % n;
        }
            System.out.println("FPB = "+ n);
    }
}
