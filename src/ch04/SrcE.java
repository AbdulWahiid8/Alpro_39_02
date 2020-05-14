package ch04;
import java.util.Arrays;
public class SrcE {
    public static void main(String[] args) {

        int [] angka =  {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println(Arrays.toString(angka));
        System.out.println("array tersebut yang memiliki angka 2 adalah");

        for(int bilangan : angka) {
            if(String.valueOf(bilangan).contains("2")){
                System.out.println(bilangan);
            }
        }

    }
}
