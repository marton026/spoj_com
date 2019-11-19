package extra.pl_spoj_com;

import java.util.Scanner;

/**
 * https://pl.spoj.com/problems/PRZEDSZK/
 */

public class Przedszk {

    private static int nww(int pierwsza, int druga) {
        while (pierwsza != druga) {
            if (pierwsza > druga) {
                pierwsza = pierwsza - druga;
            } else {
                druga = druga-pierwsza;
            }
        }
        return pierwsza;
    }

    private static boolean czyLiczbyPoprawne(int liczba1, int liczba2) {

        return (liczba1 >= 10 && liczba2 <= 30) ? true : false;
    }

    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);
        System.out.print("Wprowadź ilość zestawów danych od 1 do 20: ");
        int ilosc = odczyt.nextInt();
        while (ilosc <1 || ilosc > 20) {
            System.out.print("Wprowadź poprawną ilość: ");
            ilosc = odczyt.nextInt();
        }
        int tab[] = new int[ilosc];
        int liczba1,liczba2;
        for (int i=0;i<ilosc;i++) {
            System.out.println("\nPodaj dwie liczby naturalne oddzielone spacją pierwsza >=10 a druga <=30");
            liczba1 = odczyt.nextInt();
            liczba2 = odczyt.nextInt();

            if (czyLiczbyPoprawne(liczba1, liczba2)==false) {
                System.out.println("Niepoprawne liczby. Wprowadź ponownie: ");
                liczba1 = odczyt.nextInt();
                liczba2 = odczyt.nextInt();
            }
            tab[i]=liczba1*liczba2/nww(liczba1, liczba2);

        }
        System.out.println("Wynik: ");
        for (int i = 0; i <ilosc ; i++) {
            System.out.println(tab[i]);
        }
    }
}


































