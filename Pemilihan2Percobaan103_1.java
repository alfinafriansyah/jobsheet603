package Jobsheet6;
import java.util.Scanner;

public class Pemilihan2Percobaan103_1 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input03.nextInt();
        if((tahun % 4) == 0){
            if((tahun % 100) != 0){
                System.out.println("Tahun Kabisat");
            }else if((tahun % 100) == 0){
                System.out.println("Bukan Tahun Kabisat");
            }
        }else{
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
