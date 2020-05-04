/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Euclidean {
    public static void main(String[] args) {

int x, y, t;

Scanner dataInput = new Scanner(System.in);

System.out.print(" nilai x : ");
x = dataInput.nextInt();
System.out.print(" nilai y : ");
y = dataInput.nextInt();
System.out.println();

t = y % x;

do{
x = y;
y = t;
t = x % y;
} while (t != 0);

System.out.println("FPB = "+y);
}
}
