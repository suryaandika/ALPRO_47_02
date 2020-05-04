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
public class Terbesar2Variabel {
    public static void main(String[] args) {
 int pertama, kedua, terbesar;
 Scanner scan = new Scanner(System.in);
  
 System.out.print("Masukkan bilangan pertama = ");
 pertama = scan.nextInt();
  
 System.out.print("Masukkan bilangan kedua = ");
 kedua = scan.nextInt();
  

  
 if(pertama>kedua){
 terbesar = pertama;
 }else{
 terbesar=kedua;
 }System.out.println("Bilangan terbesar adalah " +terbesar);
 }
 }

