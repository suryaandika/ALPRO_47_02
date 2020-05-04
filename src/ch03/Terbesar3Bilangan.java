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
public class Terbesar3Bilangan {
    public static void main(String[] args) {
 int pertama, kedua, ketiga, terbesar;
 Scanner scan = new Scanner(System.in);
  
 System.out.print("Masukkan bilangan pertama = ");
 pertama = scan.nextInt();
  
 System.out.print("Masukkan bilangan kedua = ");
 kedua = scan.nextInt();
  
 System.out.print("Masukkan bilangan ketiga = ");
 ketiga = scan.nextInt();
  
 if(pertama>kedua && pertama>ketiga){
 terbesar = pertama;
 }else{
 if(kedua>ketiga){
 terbesar=kedua;
 }else{
 terbesar=ketiga;
 }
 }
  
 System.out.println("Bilangan terbesar adalah "+terbesar);
  
 }
}
