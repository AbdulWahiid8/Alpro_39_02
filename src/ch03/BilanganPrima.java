package ch03;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Angka");
        int bil = sc.nextInt();

        int bilangan = 0;
            for (int i = 1; i < bil; i++) {
                if(bil % i == 0)
                bilangan = bilangan + 1;
            } if(bilangan == 2)
                System.out.println("Bilangan " + bil + " Adalah Bilangan Prima " );
            else
                System.out.println("Bilangan " + bil + " Bukan Bilangan Prima " );
    }
}