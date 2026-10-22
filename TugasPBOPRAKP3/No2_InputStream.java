package TugasPBOPRAKP3;

import java.io.*;

public class No2_InputStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nama          : ");
        String nama = br.readLine();
        System.out.print("Total Belanja : ");
        double totalBelanja = Double.parseDouble(br.readLine());
        System.out.print("Diskon (%)    : ");
        double diskon = Double.parseDouble(br.readLine());
        System.out.print("Bayar         : ");
        double bayar = Double.parseDouble(br.readLine());

        double total = totalBelanja - (totalBelanja * diskon / 100);
        double kembalian = bayar - total;

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("belanja.dat"));
        dos.writeUTF(nama);
        dos.writeDouble(totalBelanja);
        dos.writeDouble(diskon);
        dos.writeDouble(total);
        dos.writeDouble(bayar);
        dos.writeDouble(kembalian);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("belanja.dat"));
        String nama2 = dis.readUTF();
        double totalBelanja2 = dis.readDouble();
        double diskon2 = dis.readDouble();
        double total2 = dis.readDouble();
        double bayar2 = dis.readDouble();
        double kembalian2 = dis.readDouble();
        dis.close();

        System.out.println("Nama          : " + nama2);
        System.out.println("Total Belanja : " + totalBelanja2);
        System.out.println("Diskon (%)    : " + diskon2);
        System.out.println("Total         : " + total2);
        System.out.println("Bayar         : " + bayar2);
        System.out.println("Kembalian     : " + kembalian2);
    }
}