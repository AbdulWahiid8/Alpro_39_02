package ch04;
public class SrcN {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah = 0;
        System.out.println("Menampilkan jumlah angka-angka array dengan angka-angka sebelumnya");
        System.out.println("==================================================================");

        for(int bilangan : angka)
            jumlah = jumlah + bilangan;
        System.out.println("Total angka seluruhnya yaitu "+ jumlah + " Dari angka-angka sebelumnya yaitu ");

        for(int bilangan : angka){
            System.out.printf("%d " , bilangan);
        }
    }
}