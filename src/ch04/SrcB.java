package ch04;

import java.util.Scanner;

public class SrcB {
    public static void main(String[] args) {

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Bilangan : ");
        int bilangan = sc.nextInt();

        boolean a = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == bilangan) {
                System.out.println("Angka terdapat pada Index ke : " + i);
                    a = true;
            }
        }
             if (!a) {
            System.out.println("Angka tidak terdapat pada Index");

             }
        }
    }

