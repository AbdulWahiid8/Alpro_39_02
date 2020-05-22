package ch09;

import java.util.Scanner;

public class AksPrimalityTest {
    public static long k[] = new long[200];
    public static void bilangan(int bil){
        k[0] = 1;
        for(int i = 0; i < bil; k[0] = -k[0], i++){
            k[1 + i] = 1;
            for(int b = i; b > 0; b--)
                k[b] = k[b-1] - k[b];
        }
    }
    public static boolean prima(int bil){
        bilangan(bil);
        k[0]++;
        k[bil]--;
        int i = bil;
        while((i--) > 0 && k[i] % bil == 0);
        return i < 0;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan : ");
        int bil = input.nextInt();

        if(prima(bil))
            System.out.println(bil + " adalah bilangan Prima");
        else
            System.out.println(bil + " Bukan bilangan Prima");
    }
}