package ch05;

public class AlgoKadane {
    public int kandaneForMaxSubArray(int[] angka) {
        int besar = 0;
        int terbesar = 0;
        for (int i = 0; i < angka.length; i++) {
            besar += angka[i];
            if (besar < 0) {
                besar = 0;
            }
            if (terbesar < besar) {
                terbesar = besar;
            }
        }
        return besar;
    }
    public int kandaneForMaxSubArrayForNegativ(int[] angka) {
        int besar = angka[0];
        int terbesar = angka[0];
        for (int i = 1; i < angka.length; i++) {
            besar = Math.max(angka[i], besar + angka[i]);
            terbesar = Math.max(terbesar, besar);
        }
        return terbesar;
    }
    public static void main(String args[]) {
        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        AlgoKadane nilakmaksimum = new AlgoKadane();

        System.out.println("Angka array terbesar adalah :  " + nilakmaksimum.kandaneForMaxSubArray(array));
        int negatif[] = {-11, -17, -4, -9, -14, -7, -72, -8};
        System.out.println("Angka terbesar dari array negatif adalah : " + nilakmaksimum.kandaneForMaxSubArrayForNegativ(negatif));
    }
}
