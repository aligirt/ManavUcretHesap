import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5f;
        float ak, ek, dk, mk, pk;
        float sak, sek, sdk, smk, spk, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kg ? :");
        ak = input.nextFloat();

        System.out.print("Elma kaç kg ? :");
        ek = input.nextFloat();

        System.out.print("Domates kaç kg ? :");
        dk = input.nextFloat();

        System.out.print("Muz kaç kg ? :");
        mk = input.nextFloat();

        System.out.print("Patlıcan kaç kg ? :");
        pk = input.nextFloat();

        sak = armut * ak;
        sek = elma * ek;
        sdk = domates * dk;
        smk = muz * mk;
        spk = patlican * pk;
        toplam = sak + sek + sdk + smk + spk;

        System.out.println("Ödenecek Toplam ücret :" + toplam + "TL'dir.");


    }
}