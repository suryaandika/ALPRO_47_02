package ch06;

public class SelectionSort {
    public static void main(String[] args) {

        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int a = 0; a < nilai.length-1; a++){
            int max = a;
            for(int b = a; b < nilai.length; b++){
                boolean urutan = nilai[b] < nilai[max];
                if(urutan){
                max = b;

                }
            }

            int wer = nilai[a];
            nilai[a] = nilai[max];
            nilai[max] = wer;
        }

        cetak(nilai);
    }

    public static void cetak(int[] nilai) {

        for(int a = 0; a < nilai.length; a++) {
            System.out.print(nilai[a]+ " ");

        }
        
    }
    
}