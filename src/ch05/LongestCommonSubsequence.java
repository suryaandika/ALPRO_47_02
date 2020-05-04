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
public class LongestCommonSubsequence {
     public static void main(String args[]) {

        String SD = "Dede";
        String SMP= "Fadillah";

        // Contoh perbandingan String dengan equals
        if (SD.equals(SMP)) {
            System.out.println("murid dan pelajar bermakna sama by equals method of String");
        }

        // Contoh perbandingan String dengan compareTo
        if (SD.compareTo(SMP) == 0) {
            System.out.println("baik murid ataupun pelajar sama-sama menggunakan compareTo method of String");
        }

        SMP = "Fadillah";

        // Contoh perbandingan String dengan equalsIgnoreCase
        if (SD.equalsIgnoreCase(SMP)) {
            System.out.println("murid dan pelajar itu sama by equalsIgnoreCase method of String");
        }

        // Contoh perbandingan String dengan compareToIgnoreCase
        if (SD.compareToIgnoreCase(SMP) == 0) {
            System.out.println("murid dan pelajar sama artinya yakni sama-sama menuntut ilmu by compareToIgnoreCase of String");
        }

        String x = "kepala sekolah";
        String y = "guru";

        // Contoh perbandingan String dengan compareTo
        if (x.compareTo(y) > 0) {
            System.out.println("kepala sekolah jabatannya lebih tinggi dari guru");
        } else if (x.compareTo(y) < 0) {
            System.out.println("kepala sekolah jabatannya lebih rendah dari guru");
        }
    }
}
