package ch06;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("Data Sebelum di Sorting");

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));

        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length - 1; j++) {
                boolean isPengurutan = angka[j] < angka[j + 1];
                if (!isPengurutan) {
                    int baru = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = baru;
                }
            }
        }
        System.out.println("===========================================");
        System.out.println("Hasil Sorting : ");
        for (int bilangan : angka){
            System.out.printf("%d " , bilangan);
        }
    }
}