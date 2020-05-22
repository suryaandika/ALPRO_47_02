package ch09;

import java.util.Scanner;

public class AKSPT {

    public static long k[] = new long[1000];

    public static void koefesien(final int lim) {

        k[0] = 1;
        for(int a = 0; a < lim; k[0] = -k[0], a++){
            k[1+a] = 1;
            for(int b = a; b > 0; b--)
                k[b] = k[b-1]-k[b];
        }
    }

    public static boolean prima(final int lim){
        koefesien(lim);
        k[0]++;
        k[lim]--;
        int a = lim;
        while((a--)>0&&k[a]%lim==0);
        return a < 0;
    }

    public static void main(final String[]args) {

        final Scanner nw = new Scanner(System.in);
        System.out.println("Silahkan Masukan bilangan");
        final int lim = nw.nextInt();

        if(prima(lim))
            System.out.println("Bilangan Prima");
        else
            System.out.println("Bukan Bilangan Prima");

    }
    
}