/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03;


import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PembagiTerkecil {
        public static void main(String args[]){
        int min;
        String angka = "";
        Scanner baca;
        String ulang;
        baca = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int bil = Integer.parseInt(baca.next());
        
        for (int i=3; i<=5; i++){
            if (bil%i==0){
             angka+=i+" ";
            }   
        }
        System.out.print("pembagi terkecil adalah " +angka);

        }
    }


