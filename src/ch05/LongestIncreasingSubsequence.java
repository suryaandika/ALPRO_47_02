/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author HP
 */
public class LongestIncreasingSubsequence {
      public static void main(String[] args) {
           int A = 10;
    int B [] = {5,2,9,7,1,6,8,3,10,4};
    int up, center, down;
    int search = 9;
    up = 0;
    center = A - 1;
    down = 0;
    boolean ditemukan;
    ditemukan = false;
   
    while((up <= center) && (ditemukan == false)){
       
        down = (up + center) / 2;
        if (B[down] == search){
            ditemukan = true;
        } else
            if (B[down] <= search){
            up = down + 1;
        } else {
            up = down - 1;
        }
        }
    if (ditemukan) {
        System.out.println ("Angka : "+ search + "Data berada di urutan nomor " + down);
    } else {
        System.out.println ("Angka :" + search + "Data tidak di temukan");
    }
    }
}
