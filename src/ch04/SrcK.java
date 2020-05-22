package ch04;
import java.util.Arrays;
public class SrcK {
    public static void main(String[] args) {

        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println(Arrays.toString(angka));
        System.out.println("Angka Setelah bernilai besar");

        for (int i = 0; i < 12; i++){
            int i2 = i + 1;
            int i3 = angka[i2];
            if (angka[i] < i3){
                System.out.printf("%d " , angka[i2]);
            }
        }
    }
}
