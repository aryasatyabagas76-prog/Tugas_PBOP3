/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOPRAKP3;

import java.util.Scanner;
//Scanner Hanya membutuhkan satu package yg di mana ini lebih memudahkan bagi para pengguna karena hanya membutuhkan satu package 

/**
 *
 * @author bagas
 */
public class No3_Scanner {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Scanner input juga sama yaitu membaca input yang dimasukkan oleh pengguna, bedanya ini lebih simple dan mudah untuk pemula
        String nama;
        
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        //berbeda dengan bufferedreaser Scanner ini lebih praktis karena bisa membaca berbagai tipe data secara langsung, seperti int menggunakan nextInt(), double menggunakan nextDouble(), dan String menggunakan nextLine()
        System.out.println("Nama Anda Adalah : " + nama);
    }
   
    
}
