/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author HP
 */
public class AngkaKelipatanLima {
      public static void main(String[] args) {
        int[] kelipatan5 = new int[12];
        int index = 0;
        int nomor =1;
        
        for(int i=1; i<=82; i++){
            if(i%5==0){
            kelipatan5[index]=i;
                System.out.println(kelipatan5[index]+" ");
                nomor++;
                index++;
            }
        }
    }
}
