package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KnuthMooris {
    private int[] match;
    public KnuthMooris(String text, String pattern){
        match = new int[pattern.length()];
        gagal(pattern);
        int cocok = kecocokan(text, pattern);
        if (cocok == -1)
            System.out.println("Tidak ada kecocokan");
        else
            System.out.println("Kecocokan terletak pada indeks : " + cocok);
    }
    private void gagal(String pat){
        int pertama = pat.length();
        match[0] = -1;
        for(int i = 1; i < pertama; i++){
            int j = match[i-1];
            while((pat.charAt(i)!= pat.charAt(j + 1)) && j >= 0)
                j = match[j];
            if(pat.charAt(i) == pat.charAt(j + 1))
                match[i]= j + 1;
            else
                match[i] = - 1;
        }
    }
    private int kecocokan(String txt, String pat){
        int a = 0;
        int b = 0;
        int lens = txt.length();
        int lenp = pat.length();
        while(a < lens && b < lenp){
            if(txt.charAt(a)==pat.charAt(b)){
                a++;
                b++;
            }
            else if(b == 0)
                a++;
            else
                b = match[b-1]+1;
        }
        return((b==lenp)?(a-lenp):-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Algoritma Knouth-Mooris Pratt");
        System.out.println("Masukan teks");
        String txt = input.readLine();
        System.out.println("Masukan pattern");
        String pat = input.readLine();
        KnuthMooris kmp = new KnuthMooris(txt, pat);
    }

}
