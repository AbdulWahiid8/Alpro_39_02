package ch03;
import java.util.Scanner;
public class VariabelXY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Angka X");
        int x = sc.nextInt();
        System.out.println("Masukkan Angka Y");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("angka X = " + x + ", adalah angka tertinggi");
        } else
            System.out.println("angka Y = " + y + ", adalah angka tertinggi");

    }
}
