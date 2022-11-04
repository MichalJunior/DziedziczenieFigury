import cztery.Czworokat;
import model.Figura;
import trzy.*;

import java.util.Scanner;

public class DziedzczenieAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figura[] tab = new Figura[5];


        String[] tabs = new String[5];


        for (int j = 0; j < tabs.length; j++) {
            GUI.askUserForSides();
            String wymiar = scanner.nextLine();
            tabs[j] = wymiar;
        }

        for (int i = 0; i < tabs.length; i++) {
            if (tabs[i].length() == 7) {
                int bok1 = Integer.parseInt(tabs[i].substring(0, 1));
                int bok2 = Integer.parseInt(tabs[i].substring(2, 3));
                int bok3 = Integer.parseInt(tabs[i].substring(4, 5));
                int bok4 = Integer.parseInt(tabs[i].substring(6, 7));

                if (czyJestProstokatem(bok1, bok2, bok3, bok4)) {
                    if (czyJestKwadratem(bok1, bok2, bok3, bok4)) {
                        Figura kwadrat = new Czworokat(bok1, bok2, bok3, bok4);
                        tab[i] = kwadrat;
                    }
                    Figura prostokat = new Czworokat(bok1, bok2, bok3, bok4);
                    tab[i] = prostokat;
                } else {
                    Figura czworokat = new Czworokat(bok1, bok2, bok3, bok4);
                    tab[i] = czworokat;
                }




               // System.out.println(tab[i].side1 + " " + tab[i].side2 + " " + tab[i].side3 + " "+ tab[i] + tab[i].getName() + " Pole "
                //        + tab[i].obliczPole(tab[i].side1, tab[i].side2, tab[i].side3));
            }


            if (tabs[i].length() == 5) {
                int bok1 = Integer.parseInt(tabs[i].substring(0, 1));
                int bok2 = Integer.parseInt(tabs[i].substring(2, 3));
                int bok3 = Integer.parseInt(tabs[i].substring(4, 5));

                if (czyJestTrójkątem(bok1, bok2, bok3)) {
                    if (czyJestRównoramienny(bok1, bok2, bok3)) {
                        if (czyJestRównoboczny(bok1, bok2, bok3)) {
                            Figura trojkatRownoboczny = new TrojkatRownoboczny(bok1, bok2, bok3);
                            tab[i] = trojkatRownoboczny;
                        } else {
                            Figura trojkatRownoramienny = new TrojkatRownoramienny(bok1, bok2, bok3);
                            tab[i] = trojkatRownoramienny;
                        }
                    } else {
                        Figura trojkatRoznoboczny = new TrojkatRoznoboczny(bok1, bok2, bok3);
                        tab[i] = trojkatRoznoboczny;
                    }
                    //System.out.println(tab[i].side1 + " " + tab[i].side2 + " " + tab[i].side3 + " " + tab[i].getName() + " Pole "
                    //        + tab[i].obliczPole(tab[i].side1, tab[i].side2, tab[i].side3));
                } else GUI.nieUdałoSieUtworzycTrójkąta(bok1, bok2, bok3);
            }
        }
    }

    private static boolean czyJestProstokatem(int bok1, int bok2, int bok3, int bok4) {
        return (bok1 == bok2 && bok3 == bok4) || (bok1 == bok3 && bok2 == bok4) || (bok1 == bok4 && bok2 == bok3);
    }

    private static boolean czyJestKwadratem(int bok1, int bok2, int bok3, int bok4) {
        return bok1 == bok2 && bok3 == bok4 && bok1 == bok4;
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

    public static void rozpoznajFigure(String wymiary) {


    }


}

