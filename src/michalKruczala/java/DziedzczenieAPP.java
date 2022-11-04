import trzy.Trojkat;
import trzy.TrojkatRownoboczny;
import trzy.TrojkatRownoramienny;
import trzy.TrojkatRoznoboczny;

import java.util.Arrays;
import java.util.Scanner;

public class DziedzczenieAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trojkat[] tab = new Trojkat[5];
        String[] tabs = new String[5];

        for (int j = 0; j < tabs.length; j++) {
            GUI.askUserForSides();
            String wymiar = scanner.nextLine();
            tabs[j] = wymiar;
        }

        for (int i=0;i< tabs.length;i++) {

            int bok1 = Integer.parseInt(tabs[i].substring(0, 1));
            int bok2 = Integer.parseInt(tabs[i].substring(2, 3));
            int bok3 = Integer.parseInt(tabs[i].substring(4, 5));

            if (czyJestTrójkątem(bok1, bok2, bok3)) {
                if (czyJestRównoramienny(bok1, bok2, bok3)) {
                    if (czyJestRównoboczny(bok1, bok2, bok3)) {
                        TrojkatRownoboczny trojkatRownoboczny = new TrojkatRownoboczny(bok1, bok2, bok3);
                        tab[i] = trojkatRownoboczny;
                    } else {
                        TrojkatRownoramienny trojkatRownoramienny = new TrojkatRownoramienny(bok1, bok2, bok3);
                        tab[i] = trojkatRownoramienny;
                    }
                } else {
                    TrojkatRoznoboczny trojkatRoznoboczny = new TrojkatRoznoboczny(bok1, bok2, bok3);
                    tab[i] = trojkatRoznoboczny;
                }
                System.out.println(tab[i].side1 + " " + tab[i].side2 + " " + tab[i].side3 + " " + tab[i].getName() + " Pole "
                        + tab[i].obliczPole(tab[i].side1, tab[i].side2, tab[i].side3));
            } else GUI.nieUdałoSieUtworzycTrójkąta(bok1,bok2,bok3);

        }
    }

    private static boolean czyJestRównoboczny(int bok1, int bok2, int bok3) {
        return bok1 == bok2 && bok3 == bok1;
    }

    private static boolean czyJestRównoramienny(int bok1, int bok2, int bok3) {
        return bok1 == bok2 || bok3 == bok1 || bok2 == bok3;
    }

    private static boolean czyJestTrójkątem(int bok1, int bok2, int bok3) {
        return (bok1 + bok2 > bok3 && bok1 - bok2 < bok3) && (bok1 + bok3 > bok2 && bok1 - bok3 < bok2) && (bok2 + bok3 > bok1 && bok2 - bok3 < bok1);
    }

    public void rozpoznajFigure(String boki) {


    }
}
