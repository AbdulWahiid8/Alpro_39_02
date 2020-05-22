package ch07;
import java.util.Arrays;
public class MergeSort {
    public static void merge(int arr[], int i, int j){
        int nilai1= i;
        int nilai2= j;
        if(i >= j){
            return;
        }
        int value = (nilai1 + nilai2)/2;
        merge(arr, nilai1, value);
        merge(arr, value + 1, nilai2);

        int akhir = value;
        int awal = value + 1;

        while((i <= akhir) && (awal <= nilai2)){
            if(arr[nilai1] < arr[awal]){
                nilai1++;
            }
            else{
                int srt = arr[awal];
                for(int d = awal-1; d >= nilai1; d--){
                    arr[d+1] = arr[d];
                }
                arr[nilai1] = srt;
                nilai1++;
                akhir++;
                awal++;
            }
        }
    }
    public static void main(String[] args) {
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));

        merge(angka, 0, angka.length-1);

        System.out.println("Data setelah di sorting ");
        for (int bilangan : angka) {
            System.out.print(bilangan + " ");
        }
    }
}
