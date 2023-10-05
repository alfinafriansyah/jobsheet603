package Jobsheet6;

import java.util.Scanner;

public class Latihan203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.print("Masukkan Jenis Buku: ");
        String jenis = input03.nextLine();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlah = input03.nextInt();
        System.out.print("Masukkan harga: ");
        int harga = input03.nextInt();
        double diskon;
        if (jenis.equalsIgnoreCase("kamus")){
            if (jumlah > 2){
                diskon = 0.12;
            }else{
                diskon = 0.1;
            }
        }else if (jenis.equalsIgnoreCase("novel")){
            if (jumlah > 3){
                diskon = 0.09;
            }else {
                diskon = 0.08;
            }
        }else if (jumlah > 3){
            diskon = 0.05;
        }else {
            diskon = 0;
        }
        int total = harga * jumlah;
        double diskon2 = total * diskon;
        double bayar = total - diskon2;
        System.out.println("Diskon yang didapatkan: " + (int) (diskon * 100) + "%");
        System.out.println("Diskon Rupiah: Rp. " + (int) diskon2);
        System.out.println("Jumlah yang harus dibayar adalah: Rp. " + (int) bayar);
    }
}
