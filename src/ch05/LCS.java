package ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main  {
    public static int LCSLength(String X, String Y, int m, int n, Map<String, Integer > huruf) {

              if (m == 0 || n == 0)
                    return 0;

                  String lcs = m + "|" + n;

        if (!huruf.containsKey(lcs)) {
            if (X.charAt(m - 1) == Y.charAt(n - 1)) {
                huruf.put(lcs, LCSLength(X, Y, m - 1, n - 1, huruf) + 1);
            } else {
                huruf.put(lcs, Integer.max(LCSLength(X, Y, m, n - 1, huruf),
                        LCSLength(X, Y, m - 1, n, huruf)));
            }
        }
        return huruf.get(lcs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama 1 : ");
            String X = sc.next();
        System.out.print("Masukkan Nama 2 : ");
            String Y = sc.next();

        Map<String, Integer> huruf = new HashMap<>();

        System.out.print("Tampilkan Karakter yang sama : " + LCSLength(X, Y, X.length(), Y.length(), huruf));
    }
}
