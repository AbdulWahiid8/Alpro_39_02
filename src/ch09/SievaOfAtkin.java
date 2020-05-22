package ch09;
import java.util.Scanner;
public class SievaOfAtkin {
    public static int bilangan (int bil){
        if(bil > 2)
            System.out.print(2+" ");
        else if(bil > 3)
            System.out.println(3+" ");
        boolean sieve[] = new boolean[bil];
        for(int i = 0; i < bil; i++)
            sieve[i]= false;
        for(int j = 1; j < bil; j++){
            for(int c = 1; c * c < bil; c++){
                int d = (4 * j * j)+(c*c);

                if(d <= bil && (d % 12 == 1|| d % 12 == 5))
                    sieve[d] ^= true;
            }
        }
        for(int e = 5; e * e < bil; e++){
            if(sieve[e]){
                for(int a = e * e; a < bil; a += e * e)
                    sieve[e]=false;
            }
        }
        for (int prima = 5; prima < bil; prima++)
            if(sieve[prima])
                System.out.print(prima+" ");
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan : ");
        int bil = sc.nextInt();
        System.out.println("Bilangan Prima dari angka tsb adalah");

        bilangan(bil);
    }
}

