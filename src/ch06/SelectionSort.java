package ch06;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("Data Sebelum di Sorting");

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));

        int srt = 0;
        while (srt < angka.length-1) {
            int min = srt;
            int array = srt;
            while (array < angka.length) {
                if (angka[array] < angka[min]) {
                    min = array;
                }
                array++;
            }
            int loop = angka[min];
            angka[min] = angka[srt];
            angka[srt] = loop;
            srt++;
        }
        System.out.println("===========================================");
        System.out.println("Hasil Sorting : ");
        for (int bilangan : angka) {
            System.out.printf("%d " ,bilangan);
        }
    }
}