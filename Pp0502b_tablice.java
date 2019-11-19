package extra.pl_spoj_com;

import java.util.*;

/**
 * https://pl.spoj.com/problems/PP0502B/
 */

public class Pp0502b_tablice {
    public static void main(String[] args) {
        System.out.println("Odwracanie kolejności elementów tablicy");
        Scanner odczyt = new Scanner(System.in);
        int liczbaTestow;
        do {
            System.out.print("Podaj liczbę testów od 1 do 100  ");
            liczbaTestow = odczyt.nextInt();
        } while (liczbaTestow < 1 || liczbaTestow > 100);
        List<Integer> numbers = new ArrayList<>();
        String e;
        System.out.println("Podaj liczby oddzielone spacją zakończone zerem");
        do {
            e = odczyt.next();
            if (!e.equals("0")) {
                numbers.add(Integer.valueOf(e));
            }
        } while (!e.equals("0"));

        Collections.reverse(numbers);
        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers); //usunięcie duplikatów
        System.out.println("Wynik: ");
        for (Integer i :
                set) {
            System.out.print(i + " ");
        }
    }
}