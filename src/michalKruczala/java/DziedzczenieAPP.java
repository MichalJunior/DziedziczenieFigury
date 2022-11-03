import trzy.Trojkat;
import trzy.TrojkatRownoboczny;
import trzy.TrojkatRownoramienny;
import trzy.TrojkatRoznoboczny;

import java.util.Arrays;
import java.util.Scanner;

public class DziedzczenieAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trojkat[] tab = new Trojkat[10];
        int i=0;

        while (true) {
            GUI.askUserForSides();
            String boki = scanner.nextLine();

            StringBuilder sb = new StringBuilder();
            int bok1 = Integer.parseInt(boki.substring(0, 1));
            int bok2 = Integer.parseInt(boki.substring(2, 3));
            int bok3 = Integer.parseInt(boki.substring(4, 5));
         //   sb.append("bok1: ").append(bok1).append(" bok2: ").append(bok2).append(" bok3: ").append(bok3);

            if (czyJestTrójkątem(bok1, bok2, bok3)) {


                if (czyJestRównoramienny(bok1, bok2, bok3)) {
                    if (czyJestRównoboczny(bok1, bok2, bok3)) {
                        TrojkatRownoboczny trojkatRownoboczny = new TrojkatRownoboczny(bok1, bok2, bok3);
                       // sb.append(" Pole ").append(trojkatRownoboczny.obliczPole(bok1, bok2, bok3)).append(" ");
                       // sb.append(trojkatRownoboczny.getName());

                        tab[i] = trojkatRownoboczny;
                        System.out.println(sb);

                    } else {
                        TrojkatRownoramienny trojkatRownoramienny = new TrojkatRownoramienny(bok1, bok2, bok3);

                       // sb.append(" Pole ").append(trojkatRownoramienny.obliczPole(bok1, bok2, bok3)).append(" ");
                        //sb.append(trojkatRownoramienny.getName());
                      //  System.out.println(sb);
                        tab[i] =trojkatRownoramienny;
                    }

                } else {
                    TrojkatRoznoboczny trojkatRoznoboczny = new TrojkatRoznoboczny(bok1, bok2, bok3);
                   // sb.append(" Pole ").append(trojkatRoznoboczny.obliczPole(bok1, bok2, bok3)).append(" ");
                 //   sb.append(trojkatRoznoboczny.getName());
                  //  System.out.println(sb);
                    tab[i] =trojkatRoznoboczny;
                }

            } else GUI.nieUdałoSieUtworzycTrójkąta();


          
                System.out.println( tab[i].side1+" "+tab[i].side2+" "+tab[i].side3 +" "+tab[i].getName() + " Pole "
                        + tab[i].obliczPole(tab[i].side1,tab[i].side2,tab[i].side3));
            i++;
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
