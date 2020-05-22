package ch07;

public class AMS {
    public static void mergesort(int nilai[], int b, int c) {

        int nilaiTerendah= b;
        int nilaiTertinggi= c;
            if(b >= c) {
            return;

        }

        int nilaiTengah = (nilaiTerendah+nilaiTertinggi) /2;
            mergesort(nilai, nilaiTerendah, nilaiTengah);
            mergesort(nilai, nilaiTengah+1, nilaiTertinggi);

        int akhir = nilaiTengah;
        int awal = nilaiTengah+1;

                while((b <= akhir)&&(awal<=nilaiTertinggi)) {
                    if(nilai[nilaiTerendah]<nilai[awal]) {
                    nilaiTerendah++;
            }

            else {

                int tmp = nilai[awal];
                for(int d = awal-1; d >= nilaiTerendah; d--) {
                    nilai[d+1]=nilai[d];
                }

                nilai[nilaiTerendah]=tmp;
                nilaiTerendah++;
                akhir++;
                awal++;
            }
        }
    }

    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        mergesort(nilai, 0, nilai.length-1);
        for(int a = 0; a < nilai.length; a++){
            System.out.print(nilai[a]+" ");

        }
    }
}