package ch09;
import java.util.Scanner;
public class SievaOfErathothenes {
    public static void soe (int bil){
        boolean prima[] = new boolean[bil + 1];
        for(int i = 0; i < bil; i++)
            prima[i] =  true;
        for(int j = 2; j * j <= bil; j++){
            if(prima[j]==true){
                for(int a = j*j; a <= bil; a+=j)
                    prima[a]=false;
            }
        }
        for(int i = 2; i <= bil; i++){
            if(prima[i]==true)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int lim = sc.nextInt();
        System.out.println("Bilangan Prima dari angka tsb adalah");

        soe(lim);
    }
}

