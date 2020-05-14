package ch04;
import java.util.Arrays;
public class SrcG {
    public static void main(String[] args) {

        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));
        System.out.println("Angka kelipatan 5 pada array tersebut adalah");

        for(int bilangan : angka) {
            if(bilangan % 5 == 0){
                System.out.println(bilangan);
            }
        }
    }
}

