package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMS {

    public void bmss (String pertama, String kedua) {

        char[]txt = pertama.toCharArray();
        char[]path = kedua.toCharArray();
        int skip = indeks(txt,path);
        if(skip == -1) {

            System.out.println("Gak Ada Perbandingan");
        }

        else {

            System.out.println("Path Berada Pada Posisi Ke : "+skip);
        }
    }

    public int indeks(char[]txt,char[]path) {

        if (path.length == 0)
            return 0;

        int charTabel[] = makeCharTabel(path);
        int offsetTabel[] = makeOffsetTabel(path);
        for (int a = path.length - 1, b; a < txt.length;){
            for (b = path.length - 1; path[b] == txt[a]; --a, --b)
                if (b == 0)
                return a;

            a += Math.max(offsetTabel[path.length - 1 - b], charTabel[txt[a]]);
        }

        return -1;

        }

            private int[]makeCharTabel(char[]path){
            final int jumlahAlpahbet = 256;
            int[]tabel = new int[jumlahAlpahbet];

                 for(int a = 0; a < tabel.length; a++)
                     tabel[a]=path.length;

                 for (int a = 0; a < path.length-1; ++a)
                    tabel[path[a]]=path.length-1-a;
                    return tabel;
    }

    private static int[]makeOffsetTabel(char[]path) {

        int[]tabel = new int[path.length];
        int posisiTerakhir = path.length;
            for(int a = path.length-1; a >= 0; --a){
            if(awalan(path, a+1))
            posisiTerakhir = a+1;
            tabel[path.length-1-a]=posisiTerakhir-a+path.length-1;
        }

        for(int a = 0; a < path.length-1; ++a){
            int slen = akhiran(path,a);
            tabel[slen] = path.length-1-a+slen;
        }

        return tabel;
    }

    private static boolean awalan(char[]path, int kedua){
        for(int a = kedua, b = 0; a < path.length; ++a, ++b)
            if(path[a]!=path[b])
            return false;
            return true;
    }
    
    private static int akhiran(char[]path, int kedua){
        int len = 0;
        for(int a = kedua, b = path.length-1; a >= 0 && path[a]==path[b];--a,--b)
        len += 1;
        return  len;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Boyer Moore String Search ( BMS )");
        System.out.println("Silahkan Masukan Teks");
        String txt = input.readLine();
        System.out.println("Silahkan Masukan Path");
        String path = input.readLine();
        BMS bm = new BMS();
        bm.bmss(txt,path);
    }
    
}