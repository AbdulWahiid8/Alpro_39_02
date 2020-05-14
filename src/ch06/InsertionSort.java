package ch06;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("Data Sebelum di Sorting");

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));

        for (int i = 1; i < angka.length; i++) {
            int srt = angka[i];
            int j = i;
         while(j > 0 && angka[j-1] > srt) {
             angka[j] = angka[j-1];
             j--;
         }
         angka[j] = srt;
        }
        System.out.println("Hasil Sorting: ");
        for(int bilangan : angka) {
            System.out.printf("%d ", bilangan);
        }
    }
}
