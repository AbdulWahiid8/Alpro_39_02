package ch05;

public class LIS {
   static int lis(int angka[], int n) {
        int lis[] = new int[n];
        int i, j, max = 0;

        for (i = 0; i < n; i++)
            lis[i] = 1;

        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (angka[i] > angka[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
        return max;
    }

    public static void main(String args[]) {
        int angka[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int n = angka.length;
        System.out.println("Tampilkan LIS = " + lis(angka, n) + "\n");
    }
}




