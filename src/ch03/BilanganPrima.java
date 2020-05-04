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
public class BilanganPrima {
    public static void main (String args []){
  
  Scanner input = new Scanner(System.in);
  System.out.println(" input angka yang ingin diketahui: ");
  
  int angka = input.nextInt();
  
  int bil;
  boolean prima = true;
  
  //penggunaan for loop
  for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
   
   bil = angka % pembagi;
   
   if(bil == 0){
    
    prima = false;
    break;
    
   }
  }
  
  if(prima && ((angka > 0)&&(angka != 1)))
   System.out.println(angka + " adalah bilangan prima");
  else
   System.out.println(angka + " bukanlah bilangan prima");
  
 }
 
}

