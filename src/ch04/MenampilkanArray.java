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
public class MenampilkanArray {
    public static void main(String[] args) {
      int arr[];//mendeklarasikan array
      arr=new int[13]; //menentukan kapasitas array
      
     /*
      Baris diatas menghasilkan efek yang sama  dengan baris berikut:
      int arr[] = new int[12];
      */
    
    arr[0] = 82; //mengisi element ke-0 dengan nilai 82
    arr[1] = 12; //mengisi element ke-0 dengan nilai 12
    arr[2] = 41; //mengisi element ke-0 dengan nilai 41
    arr[3] = 38; //mengisi element ke-0 dengan nilai 38
    arr[4] = 19; //mengisi element ke-0 dengan nilai 19
    arr[5] = 26; //mengisi element ke-0 dengan nilai 26
    arr[6] = 9; //mengisi element ke-0 dengan nilai 9
    arr[7] = 48; //mengisi element ke-0 dengan nilai 48
    arr[8] = 20; //mengisi element ke-0 dengan nilai 20
    arr[9] = 55; //mengisi element ke-0 dengan nilai 55
    arr[10] = 8; //mengisi element ke-0 dengan nilai 8
    arr[11] = 32; //mengisi element ke-0 dengan nilai 32
    arr[12] = 3; //mengisi element ke-0 dengan nilai 3
    
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    }
}
