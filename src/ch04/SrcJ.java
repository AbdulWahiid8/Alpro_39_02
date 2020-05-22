package ch04;
import  java.util.Arrays;
public class SrcJ {
    public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println(Arrays.toString(angka));
        System.out.println("Selisih angka genap dengan setelahnya angka genap pula");

        int selisih = 0;

        for (int i = 0; i < angka.length; i++){
            if (angka[i] % 2 == 0){

                for (int i2 = i + 1; i2 < angka.length; i2++)
                    if (angka[i2] % 2 == 0){
                        selisih = angka[i] - angka[i2];
                        System.out.printf("%d " , selisih);
                    }
            }
        }
    }
}
