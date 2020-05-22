package ch09;

import java.util.Arrays;
import java.util.Scanner;
public class SieveOfSurandam {
    public static int surandam(int bil){
        int bilBaru = (bil - 2) / 2;
        boolean prima[] = new boolean[bilBaru+1];

        Arrays.fill(prima,false);

        for(int i = 1; i <= bilBaru; i++)
            for(int j = i; (i + j + 2 * i * j) <= bilBaru; j++)
                prima[i + j + 2 * i * j] = true;
        if(bil > 2)
            System.out.print(2 + " ");
        for(int i = 1; i <= bilBaru; i++)
            if(!prima[i])
                System.out.print(2 * i + 1 +" ");
        return-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Batas Bilangan : ");
        int bil = sc.nextInt();
        System.out.println("Bilangan Prima dari angka tsb adalah");

        surandam(bil);
    }
}
