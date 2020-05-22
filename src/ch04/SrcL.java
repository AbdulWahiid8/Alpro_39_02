package ch04;
import java.util.Arrays;
public class SrcL {

    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println(Arrays.toString(angka));
        System.out.println(" Jumlah angka dengan angka setelahnya dengan hasil genap adalah : ");

        for (int i = 0; i < angka.length - 1; i++){
            int jumlah = angka[i] + angka[i + 1];
            if (jumlah % 2 == 0)
                System.out.print(" " + jumlah);
        }
        System.out.print(" ");
    }
}
