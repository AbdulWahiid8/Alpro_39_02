package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooyerMoore {
    public void match (String pertama, String kedua){
        char[]text = pertama.toCharArray();
        char[]pattern = kedua.toCharArray();
        int cocok = indeks(text,pattern);
        if(cocok == -1) {
            System.out.println("Tidak ada Kecocokan");
        }
        else {
            System.out.println("Karakter yang cocok berada pada posisi ke-" + cocok);
        }
    }
    public int indeks(char[]text,char[]pattern) {
        if (pattern.length == 0)
            return 0;
        int charTabel[] = makeCharTabel(pattern);
        int offsetTabel[] = makeOffsetTabel(pattern);
        for (int a = pattern.length - 1, b; a < text.length;){
            for (b = pattern.length - 1; pattern[b] == text[a]; --a, --b)
                if (b == 0)
                    return a;
            a += Math.max(offsetTabel[pattern.length - 1 - b], charTabel[text[a]]);
        }
        return -1;
    }
    private int[]makeCharTabel(char[]pat){
        final int jumlahAlpahbet = 256;
        int[]tabel = new int[jumlahAlpahbet];
        for(int a = 0; a < tabel.length; a++)
            tabel[a]=pat.length;
        for (int a = 0; a < pat.length-1; ++a)
            tabel[pat[a]]=pat.length-1-a;
        return tabel;
    }
    private static int[]makeOffsetTabel(char[]pat){
        int[]tabel = new int[pat.length];
        int posisiTerakhir = pat.length;
        for(int a = pat.length-1; a >= 0; --a){
            if(awalan(pat, a+1))
                posisiTerakhir = a+1;
            tabel[pat.length-1-a]=posisiTerakhir-a+pat.length-1;
        }
        for(int a = 0; a < pat.length-1; ++a){
            int slen = akhiran(pat,a);
            tabel[slen] = pat.length-1-a+slen;
        }
        return tabel;
    }
    private static boolean awalan(char[]pat, int kedua){
        for(int a = kedua, b = 0; a < pat.length; ++a, ++b)
            if(pat[a]!=pat[b])
                return false;
        return true;
    }
    private static int akhiran(char[]pat, int kedua){
        int len = 0;
        for(int a = kedua, b = pat.length-1; a >= 0 && pat[a]==pat[b];--a,--b)
            len += 1;
        return  len;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Boyer Moore String Search");
        System.out.println("Masukan teks 1");
        String txt = input.readLine();

        System.out.println("Masukan pattern 2");
        String pat = input.readLine();

        BooyerMoore bm = new BooyerMoore();
        bm.match(txt,pat);
    }
}