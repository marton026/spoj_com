package extra.pl_spoj_com;

import java.util.Scanner;

/**
 * https://pl.spoj.com/problems/BFN1/
 */
public class Bfn1 {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Program wyszukuje palindromy");
        int ilosc;
        do {
            System.out.println("Wprowadź ilość liczb do sprawdzenia");
            ilosc = odczyt.nextInt();
        } while (ilosc < 1 || ilosc > 80);
        String[] tab = new String[ilosc];
        for (int i = 0; i < ilosc; i++) {
            System.out.print("Podaj "+(i+1)+" liczbę ");
            Scanner scanner = new Scanner(System.in);
            int suma,i1 = scanner.nextInt();
            int licznik=0;
            String wynik;
            if (czyPalindrom(i1)) {
                 wynik = i1+" 0";
            } else {
                do {
                    suma = i1 + liczbaOdwrocona(i1);
                    licznik++;
                    i1 = suma;
                } while (czyPalindrom(suma)==false);
                 wynik = suma+" "+licznik;
            }
            tab[i] = wynik;
        }
        System.out.println("Wyjście:");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }

    private static boolean czyPalindrom(int liczba) {
       int tmp = liczba;
        int suma = liczbaOdwrocona(liczba);
        return (tmp==suma)?true:false;
    }

    private static int liczbaOdwrocona(int liczba) {
        int r,suma = 0;
        while (liczba>0) {
            r=liczba%10;
            suma = (suma*10)+r;
            liczba=liczba/10;
        }
        return suma;
    }


}
