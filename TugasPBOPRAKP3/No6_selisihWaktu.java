package TugasPBOPRAKP3;

import java.util.Scanner;

public class No6_selisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int twaktu1;
        int twaktu2;
        int selisih;
        
        
        
        System.out.println("Waktu Pertama");
        System.out.print("Masukan Jam : ");
        int jam1 = input.nextInt();
        
        System.out.print("Masukan Menit : ");
        int menit1 = input.nextInt();
        
        System.out.print("Masukan Detik : ");
        int detik1 = input.nextInt();
        
        System.out.println("Waktu Kedua");
        System.out.print("Masukan Jam : ");
        int jam2 = input.nextInt();
        
        System.out.print("Masukan Menit : ");
        int menit2 = input.nextInt();
        
        System.out.print("Masukan Detik : ");
        int detik2 = input.nextInt();
        
        twaktu1 = jam1 * 3600 + menit1 * 60 + detik1;
        twaktu2 = jam2 * 3600 + menit2 * 60 + detik2;
        selisih = Math.abs(twaktu1 - twaktu2);
        
        int jam = selisih/3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;
        
        System.out.println("Selisih waktu : " + jam +" Jam " + menit +" Menit " + detik +" Detik");
        
         
        
        
        
        
    }
}
