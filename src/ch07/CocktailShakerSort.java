package ch07;
import java.util.Arrays;
public class CocktailShakerSort {
    public static void cocktail(int[] angka) {
        boolean Sort;
        do {
            Sort = false;
            for (int i = 0; i <= angka.length - 2; i++) {
                if (angka[i] > angka[i + 1]) {
                    int srt = angka[i];
                    angka[i] = angka[i + 1];
                    angka[i + 1] = srt;
                    Sort = true;
                }
            }
            if (!Sort) {
                break;
            }
        } while (Sort);
    }
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));

        System.out.println("Data setelah di sorting");

        cocktail(angka);

        for (int bilangan : angka) {
            System.out.print(bilangan + " ");
        }
    }
}

