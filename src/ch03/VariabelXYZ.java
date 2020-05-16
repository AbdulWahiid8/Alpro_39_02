package ch03;
import java.util.Scanner;
public class VariabelXYZ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Bilangan X");
            int x = sc.nextInt();

        System.out.println("Masukkan Bilangan Y");
            int y = sc.nextInt();

        System.out.println("Masukkan Bilangan Z");
            int z = sc.nextInt();

            if (x > y && x > z) {
                System.out.println("Angka X adalah angka tertinggi = " + x);
            } if ( y > z && y > x) {
                System.out.println("Angka Y adalah angka tertinggi = " + y);
            } else if (z > x && z > y) {
                System.out.println("Angka Z adalah angka tertinggi = " + z);
            }
        }
    }
