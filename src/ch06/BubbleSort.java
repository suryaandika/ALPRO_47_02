package ch06;

    public class BubbleSort {

        public static void main(String[] args) {
            int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
            for(int a = 0; a < nilai.length-1; a++){
                for(int b = 0; b < nilai.length; b++){
                    boolean urutan = nilai [a] < nilai [b];
            if(urutan){
            int tmp = nilai[a];
            nilai[a] = nilai[b];
            nilai[b] = tmp;

        }

    }

}

        Mencetak(nilai);

}

public static void Mencetak(int[] nilai) {
    for(int a = 0; a < nilai.length; a++){
        System.out.print(nilai[a]+ " ");

        
        }

    }

}