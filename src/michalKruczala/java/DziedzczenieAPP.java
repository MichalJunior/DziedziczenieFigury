import cztery.Czworokat;
import cztery.Kwadrat;
import cztery.Prostokat;
import model.Figura;
import piec.Pieciokat;
import piec.PieciokatForemny;
import szesc.Szesciokat;
import szesc.SzesciokatForemny;
import trzy.*;

import java.util.Scanner;

public class DziedzczenieAPP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ileFigur = zapytajIleFigur();
        Figura[] tab = new Figura[ileFigur];
        String[] tabs = new String[ileFigur];

        for (int j = 0; j < tabs.length; j++) {
            GUI.zapytajUżytkownikaOWymiary();
            String wymiary = scanner.nextLine();
            tabs[j] = wymiary;
        }
        for (int i = 0; i < tabs.length; i++) {

            if (tabs[i].length() == 11) {
                int bok1 = Integer.parseInt(tabs[i].substring(0, 1));
                int bok2 = Integer.parseInt(tabs[i].substring(2, 3));
                int bok3 = Integer.parseInt(tabs[i].substring(4, 5));
                int bok4 = Integer.parseInt(tabs[i].substring(6, 7));
                int bok5 = Integer.parseInt(tabs[i].substring(8, 9));
                int bok6 = Integer.parseInt(tabs[i].substring(10, 11));
                if (czySzesciakatJestForemny(bok1, bok2, bok3, bok4, bok5, bok6)) {
                    tab[i] = new SzesciokatForemny(bok1, bok2, bok3, bok4, bok5, bok6);
                } else {
                    tab[i] = new Szesciokat(bok1, bok2, bok3, bok4, bok5, bok6);
                }
                System.out.println("Pole " + tab[i].obliczPole(bok1, bok2, bok3, bok4, bok5, bok6) + " " + tab[i].getName() + " Obwód " + tab[i].obliczObwód(bok1, bok2, bok3, bok4, bok5, bok6));
            }
            if (tabs[i].length() == 9) {
                int bok1 = Integer.parseInt(tabs[i].substring(0, 1));
                int bok2 = Integer.parseInt(tabs[i].substring(2, 3));
                int bok3 = Integer.parseInt(tabs[i].substring(4, 5));
                int bok4 = Integer.parseInt(tabs[i].substring(6, 7));
                int bok5 = Integer.parseInt(tabs[i].substring(8, 9));
                if (czyPieciakatJestForemny(bok1, bok2, bok3, bok4, bok5)) {

                    tab[i] = new PieciokatForemny(bok1, bok2, bok3, bok4, bok5);
                } else {

                    tab[i] = new Pieciokat(bok1, bok2, bok3, bok4, bok5);
                }
                System.out.println("Pole " + tab[i].obliczPole(bok1, bok2, bok3, bok4, bok5, 0) + " " + tab[i].getName() + " Obwód " + tab[i].obliczObwód(bok1, bok2, bok3, bok4, bok5, 0));
            }
            if (tabs[i].length() == 7) {
                int bok1 = Integer.parseInt(tabs[i].substring(0, 1));
                int bok2 = Integer.parseInt(tabs[i].substring(2, 3));
                int bok3 = Integer.parseInt(tabs[i].substring(4, 5));
                int bok4 = Integer.parseInt(tabs[i].substring(6, 7));
                if (czyJestKwadratem(bok1, bok2, bok3, bok4)) {
                    tab[i] = new Kwadrat(bok1, bok2, bok3, bok4);
                } else if (czyJestProstokatem(bok1, bok2, bok3, bok4)) {

                    tab[i] = new Prostokat(bok1, bok2, bok3, bok4);
                } else {
                    tab[i] = new Czworokat(bok1, bok2, bok3, bok4);
                }
                System.out.println("Pole " + tab[i].obliczPole(bok1, bok2, bok3, bok4, 0, 0) + " " + tab[i].getName() + " Obwód " + tab[i].obliczObwód(bok1, bok2, bok3, bok4, 0, 0));
            }
            if (tabs[i].length() == 5) {
                int bok1 = Integer.parseInt(tabs[i].substring(0, 1));
                int bok2 = Integer.parseInt(tabs[i].substring(2, 3));
                int bok3 = Integer.parseInt(tabs[i].substring(4, 5));

                if (czyJestTrójkątem(bok1, bok2, bok3)) {
                    if (czyJestRównoramienny(bok1, bok2, bok3)) {
                        if (czyJestRównoboczny(bok1, bok2, bok3)) {
                            tab[i] = new TrojkatRownoboczny(bok1, bok2, bok3);
                        } else {
                            tab[i] = new TrojkatRownoramienny(bok1, bok2, bok3);
                        }
                    } else {
                        tab[i] = new TrojkatRoznoboczny(bok1, bok2, bok3);
                    }
                    System.out.println("Pole " + tab[i].obliczPole(bok1, bok2, bok3, 0, 0, 0) + " " + tab[i].getName() + " Obwód " + tab[i].obliczObwód(bok1, bok2, bok3, 0, 0, 0));
                } else GUI.nieUdałoSieUtworzycTrójkąta(bok1, bok2, bok3);
            }
        }
    }

    private static int zapytajIleFigur() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Ile figur chcialbys wprowadzic?:");
        return scanner2.nextInt();
    }

    private static boolean czySzesciakatJestForemny(int bok1, int bok2, int bok3, int bok4, int bok5, int bok6) {
        return bok1 == bok2 && bok2 == bok3 && bok4 == bok6 && bok6 == bok1 && bok2 == bok5;
    }

    private static boolean czyPieciakatJestForemny(int bok1, int bok2, int bok3, int bok4, int bok5) {
        return bok1 == bok2 && bok3 == bok4 && bok1 == bok3 && bok5 == 1;
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

}

