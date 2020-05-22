package ch07;
import java.util.Arrays;
public class BlockSort {
    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("Data Sebelum di Sorting");

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));

        int srt;

        for(int i = 0; i < angka.length; i++){
            for(int j = 0; j < angka.length; j++){
                if (angka[i]<angka[j]){
                    srt = angka[i];
                    angka[i] = angka[j];
                    angka[j] = srt;
                }
            }
        }
        System.out.println("============================================");
        System.out.println("Data setelah di Sorting");
        for(int bilangan : angka){
            System.out.print(bilangan +" ");
        }
    }
}
