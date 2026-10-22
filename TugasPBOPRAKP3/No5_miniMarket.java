package TugasPBOPRAKP3;

import java.io.*;
public class No5_miniMarket {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int tmangga;
        int tjambu;
        int total;
        
        
        System.out.print("Masukan Jumlah Mangga : ");
        int mangga = Integer.parseInt(br.readLine());
        
        System.out.print("Jumlah Mangga Busuk : ");
        int mbusuk = Integer.parseInt(br.readLine());
        
        System.out.print("Jumlah Jambu : ");
        int jambu = Integer.parseInt(br.readLine());
        
        System.out.print("Jumlah tetangga : ");
        int tetangga = Integer.parseInt(br.readLine());
        
        tmangga = mangga - mbusuk;
        tjambu = tetangga * jambu;
        total = tmangga + tjambu;
        
        System.out.println("Total Mangga Bagus : " + tmangga);
        System.out.println("Total Jambu : " + tjambu);
        System.out.println("Total : " + total);
        
        
        
        
        
        
        
    }
}
