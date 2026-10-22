/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBOPRAKP3;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class No7_Novel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Novel : ");
        int jmlNovel = input.nextInt();
        System.out.print("Masukan Lembar per novel : ");
        int Tlembar = input.nextInt();
        
        int tebalLembar = jmlNovel * Tlembar;
        int detik = tebalLembar;
        
        
        long menit = detik / 60;
        detik -= 60 * menit;

        long jam = menit / 60;
        menit -= 60 * jam;

        long hari = jam / 24;
        jam -= 24 * hari;

        System.out.println(hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}