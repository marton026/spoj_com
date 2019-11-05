package extra.pl_spoj_com;

import java.util.Scanner;

public class Flamaster3 {

    /**
     * https://pl.spoj.com/problems/FLAMASTE/
     */

    private static void wprowadzWyrazy(String[] tab, int ilosc) {
        System.out.println("Wprowadź " + ilosc + " wyrazy pisane wielkimi literami: ");
        Scanner odczyt = new Scanner(System.in);
        String wyraz = odczyt.next();
        for (int i = 0; i < ilosc; i++) {
            while (!czyWielkieLitery(wyraz)) {
                System.out.print("Wprowadź wielkie litery: ");
                wyraz = odczyt.next();
            }
            tab[i] = wyraz;
            if (i < ilosc - 1) {
                wyraz = odczyt.next();
            }
        }
    }

    private static void szukajDuplikatow(String[] tab) {
        int licz = 1;
        System.out.println("Wyrazy po przetworzeniu: ");
        for (int i = 0; i < tab.length; i++) {
            String znaki = tab[i];
            System.out.print("\nPrzetworzony " + (i + 1) + " wyraz to: ");
            for (int j = 0; j < znaki.length(); j++) {
                char znak = znaki.charAt(j);
                if (j + 1 == znaki.length()) {
                    System.out.print(znak);
                    licz = getLicz(licz, znak);
                    break;
                }
                if (znak == znaki.charAt(j + 1)) {
                    licz++;
                } else {
                    System.out.print(znak);
                    licz = getLicz(licz, znak);
                }
            }
        }
    }

    private static int getLicz(int licz, char znak) {   //metoda pomocnicza
        if (licz > 2) {
            System.out.print(licz);
        } else if (licz == 2) {
            System.out.print(znak);
        }
        licz = 1;
        return licz;
    }

    private static void wyswietlWyrazy(String[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    private static boolean czyWielkieLitery(String wyraz) {
        return (wyraz.equals(wyraz.toUpperCase())) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("Program zastępuje powtórzone znaki liczbą powtórzeń");
        Scanner odczyt = new Scanner(System.in);
        int ilosc;
        do {
            System.out.print("Podaj liczbę wyrazów od 1 do 50: ");
            ilosc = odczyt.nextInt();
        } while (ilosc < 1 || ilosc > 50);
        String[] tabStringow = new String[ilosc];
        wprowadzWyrazy(tabStringow, ilosc);
        //wyswietlWyrazy(tabStringow);
        szukajDuplikatow(tabStringow);
    }

}
