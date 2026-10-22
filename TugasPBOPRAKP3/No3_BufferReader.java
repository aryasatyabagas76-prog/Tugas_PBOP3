package TugasPBOPRAKP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//BufferedReader menggunakan tiga oackage ini agar bisa di jalankan, atau bisa juga menggunakan (import iava.io.*) 

public class No3_BufferReader {
    public static void main(String[] args) throws IOException {
        //lalu untuk penggunaan BufferedReader juga menggunakan throws IOException
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //BufferedReader membutuhkan InputStreamReader karena keduanya punya tugas yang berbeda, tetapi saling bekerja sama untuk membaca input dari keyboard
        
        System.out.print("Masukan Nama : ");
        String nama = br.readLine();
        //di bufferedreader juga menggunakan tipe datanya di sini, bahkan setiap tipe data nya itu default String
        System.out.println("Nama Kamu Adalah : " + nama);
        
    }
    
}
