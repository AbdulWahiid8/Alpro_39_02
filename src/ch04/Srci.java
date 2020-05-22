package ch04;
import java.util.Arrays;
public class Srci {
    public static void main(String[] args) {

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));
        System.out.println("Nilai selisih array ini adalah : ");

        int i;
        int selisih = angka[0] - angka[1];
        for (i = 0; i < angka.length; i++) {
            if (i == angka.length - 1) {
            } else {
                selisih = angka[i] - angka[i + 1];
                System.out.println("Selisih " + angka[i] + " dengan " + angka[i + 1] + " adalah = " + selisih);
            }
        }
    }
}
