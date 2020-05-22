package ch07;

public class ABS {
    public static void main(String[] args) {

        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int wes = 0;

        for(int a = 0; a < nilai.length; a++){
            for(int b = 0; b < nilai.length; b++){
                if (nilai[a]<nilai[b]){
                    wes = nilai[a];
                    nilai[a] = nilai[b];
                    nilai[b] = wes;
                    
                }
            }
        }

        for(int a = 0; a < 13; a++){
            System.out.print(nilai[a]+" ");

        }
    }
    
}