package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Name  : Agung Sepruloh
 * Class : IF-11K
 * NIM   : 10118902
 *
 */

public class HurufBesarKecil {

    public static void formatting(String word) {
        System.out.println("\n===== Hasil Formatting =====");
        System.out.println("Huruf Besar: ".concat(word.toUpperCase()));
        System.out.println("Huruf Kecil: ".concat(word.toLowerCase()));
    }

    public static void main(String[] args) {
        System.out.print("Masukkan Kalimat: ");
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        formatting(kalimat);
    }
}
