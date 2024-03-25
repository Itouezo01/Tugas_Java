package com.mycompany.variabeljava;
import java.util.Scanner;

public class Variabeljava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiA = 20;
        int nilaiB = 30;
        double nilaiBA = 23;
        double nilaiBB = 43;
        boolean inPlus = true;
        String namaMahasiswa;

        System.out.println("Nilai A: " + nilaiA);
        System.out.println("Nilai B: " + nilaiB);
        System.out.println("Nilai Double A: " + nilaiBA);
        System.out.println("Nilai Double B: " + nilaiBB);
        System.out.println("Nilai Boolean: " + inPlus);
        
        System.out.println("");
        System.out.print("Masukkan Nilai A: ");
        nilaiA = input.nextInt();
        System.out.print("Masukkan Nilai B: ");
        nilaiB = input.nextInt();
        System.out.print("Masukkan Nilai Double A: ");
        nilaiBA = input.nextDouble();
        System.out.print("Masukkan Nilai Double B: ");
        nilaiBB = input.nextDouble();
        System.out.print("Masukkan Nilai Boolean inPlus (false/true): ");
        inPlus = input.nextBoolean();

        // Membersihkan karakter baris baru sebelum menerima input string
        input.nextLine();

        System.out.print("Masukkan nama Mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("Hasil inputan Nilai A: " + nilaiA);
        System.out.println("Hasil Inputan Nilai B: " + nilaiB);
        System.out.println("Hasil Inputan Nilai Double A: " + nilaiBA);
        System.out.println("Hasil Inputan Nilai Double B: " + nilaiBB);
        System.out.println("Hasil Inputan Nilai Boolean Inplus: " + inPlus);
        System.out.println("Hasil Inputan Mahasiswa: " + namaMahasiswa);
    }
}
