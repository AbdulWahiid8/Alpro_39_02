package ch04;
import java.util.Arrays;
public class SrcH {
    public static void main(String[] args) {

        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
            System.out.println(Arrays.toString(angka));

            int jumlah = 0;
        for (int bilangan : angka) {
            jumlah += bilangan;
            }
                System.out.println("Jumlah Angka dalam Array tersebut adalah " + jumlah);
        }
    }

