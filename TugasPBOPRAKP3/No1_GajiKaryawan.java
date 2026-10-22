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
public class No1_GajiKaryawan {
        
     Scanner input = new Scanner(System.in);
         long npm;
         String nama;
         String alamat;
         String jabatan;
         int gaji;
         int tjabatan;
         int tistri;
         int tanak;
         int totgaji;
         double pajak;
         double gajiBersih;
         
         void hitungGaji(){
         System.out.println("-----No 1-----");
         System.out.print("\nNomor Induk Karyawan : ");
         npm = input.nextLong();
         input.nextLine();
         System.out.print("Nama Karyawan : ");
         nama = input.nextLine();
         System.out.print("Alamat : ");
         alamat = input.next();
         System.out.print("Jabatan : ");
         jabatan = input.next();
         System.out.print("Gaji Pokok : ");
         gaji = input.nextInt();
         System.out.print("Tunjangan Jabatan : ");
         tjabatan = input.nextInt();
         System.out.print("Tunjangan Istri : ");
         tistri = input.nextInt();
         System.out.print("Tunjangan Anak : ");
         tanak = input.nextInt();
         totgaji = gaji + tjabatan + tistri + tanak;
         System.out.println("Total Gaji = " + totgaji);
         pajak = 0.1 * (gaji + tjabatan + tanak);
         System.out.println("Pajak Penghasilan = " + pajak);
         gajiBersih = totgaji-pajak;
         System.out.println("Gaji Bersih = " + gajiBersih);
        }
         
    }

