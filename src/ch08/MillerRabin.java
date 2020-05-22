package ch08;

public class MillerRabin {
    public static int miller(int i, int j, int k){
        int hasil = 1;
         i = i % k;
        while(j > 0){
            if((j & 1)==1)
                hasil =(hasil * i) % k;
            j = j >> 1;
            i = (i * i) % k;
        }
        return hasil;
    }
    public static boolean rabin(int i, int j){
        int value = 1 + (int)(Math.random() % (i-4));
        int a = miller(value, j, i);
        if(a == 1 || a == i-1)
            return true;

        while(j != i - 1){
            a = (a * a) % i;
            j *= 2;
            if(a == 1)
                return false;
            if (a == i - 1)
                return true;
        }
        return false;
    }
    public static boolean prima(int i, int j){
        if(i <= 1 || i == 4)
            return false;
        if(i <= 3)
            return true;
        int d = i - 1;

        while(d % 2 == 0)
            d /= 2;
        for(int a = 0; a < j; a++)
            if(!rabin(d, i))
                return false;
        return true;
    }
    public static void main(String[] args) {
        int j = 3;
        System.out.println("Angka-angka prima dari 500");
        for(int i = 1; i < 500; i++)
            if(prima(i, j))
                System.out.print(i +" ");
    }
}
