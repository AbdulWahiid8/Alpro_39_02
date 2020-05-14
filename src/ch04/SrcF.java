package ch04;
import java.util.Arrays;
public class SrcF {
    public static void main(String[] args) {

        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));
        System.out.println(" Angka Ganjil yang diapit oleh angka genap adalah ");

        for (int i = 0; i < 12; i++) {
            if (angka[i] % 2 == 1) {
                System.out.println(angka[i]);
            }
        }
    }
}


