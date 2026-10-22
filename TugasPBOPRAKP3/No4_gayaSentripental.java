package TugasPBOPRAKP3;

import java.util.Scanner;

public class No4_gayaSentripental {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double m;
        double v;
        double r;
        double fc;
        
        System.out.println("Masukan M : ");
        m = input.nextDouble();
        System.out.println("Masukan V : ");
        v = input.nextDouble();
        System.out.println("Masukan R : ");
        r = input.nextDouble();
        
        fc = m * v * v / r;
        System.out.println("Hasilnya Adalah : " + fc);
    }
}
