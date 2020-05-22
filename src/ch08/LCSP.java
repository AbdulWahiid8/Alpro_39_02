package ch08;

public class LCSP {
    public static String lcs (String kata1, String kata2){
        int pertama = kata1.length();
        int kedua = kata2.length();
        int[][] string = new int [pertama + 1][kedua + 1];
        int awal = 0;
        int akhir = 0;

        for(int i = 0; i < pertama; i++){
            for(int j = 0; j < kedua; j++){
                if( i == 0 || j == 0){
                    string[i][j] = 0;
                }
                else if(kata1.charAt(i-1) == kata2.charAt(j-1)){
                    string[i][j] = string[i-1][j-1]+1;
                    awal = Math.max(awal, string[i][j]);
                    akhir = i;
                }
                else{
                    string[i][j] = 0;
                }
            }
        }
        return kata1.substring(akhir - awal + 1, akhir + 1);
    }
    public static void main(String[] args) {
        System.out.println(lcs("WAHID","AHIDIW"));
    }
}

