package ch07;

public class ACS {
    public static void cocktailsort(int[]nilai) {

        boolean Tukar;
        do {
            Tukar = false;

            for(int a = 0; a <= nilai.length-2; a++){
                if(nilai[a]>nilai[a+1]){
                    int tmp = nilai[a];
                    nilai[a] = nilai[a+1];
                    nilai[a+1] = tmp;
                    Tukar = true;
                }
            }

        if(!Tukar) {
        break;

        }

        } while(Tukar);

    }

    public static void main(String[] args) {

        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        cocktailsort(nilai);
        for(int a = 0; a < nilai.length; a++) {
            System.out.print(nilai[a]+" ");

        }
    }
}