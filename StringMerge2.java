package extra.pl_spoj_com;

import java.util.Scanner;

/**
 * https://pl.spoj.com/problems/PP0504B/
 */

public class StringMerge2 {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        int ilosc;
        do {
            System.out.print("Podaj ilość testów: ");
            ilosc = odczyt.nextInt();
        } while (ilosc < 1);
        mix(ilosc);
    }

    private static void mix(int ilosc) {
        String wyraz1,wyraz2;
        Scanner odczyt = new Scanner(System.in);
        int dlugoscMin;
        for (int i = 0; i < ilosc; i++) {
            System.out.println("Wprowadź " + (i + 1) + " ciąg dwóch wyrazów oddzielonych spacją: ");
            wyraz1 = odczyt.next();
            wyraz2 = odczyt.next();
            if (wyraz1.length() < wyraz2.length()) {
                dlugoscMin = wyraz1.length();
            } else {
                dlugoscMin = wyraz2.length();
            }
            System.out.println("Wyraz krótki ma " + dlugoscMin + " znaków");
            String wynik = "";

            for (int j = 0; j < dlugoscMin; j++) {
                wynik += String.valueOf(wyraz1.charAt(j))+ wyraz2.charAt(j);
            }
            System.out.println(wynik);
        }
    }
}
