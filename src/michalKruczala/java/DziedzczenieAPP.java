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


        GUI.askUserForSides();
        String boki = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        int bok1 = Integer.parseInt(boki.substring(0, 1));
        int bok2 = Integer.parseInt(boki.substring(2, 3));
        int bok3 = Integer.parseInt(boki.substring(4, 5));
        System.out.println("bok1: " + bok1 + " bok2: " + bok2 + " bok3: " + bok3);

        if (bok1 + bok2 > bok3 || bok1 + bok3 > bok2 || bok2 + bok3 > bok1) {
            sb.append("udalo sie utworzyć trójkąt ");


            if (bok1 == bok2 && bok3 == bok1) {
                TrojkatRownoboczny trojkatRownoboczny = new TrojkatRownoboczny(bok1, bok2, bok3);

                sb.append("Pole ").append(trojkatRownoboczny.obliczPole(bok1, bok2, bok3)).append(" ");
                sb.append(trojkatRownoboczny.getName());

                tab[0] = trojkatRownoboczny;
                System.out.println(sb);

            }
            if (bok1 == bok2 || bok3 == bok1 || bok2 == bok3) {
                tab[0] = new TrojkatRownoramienny(bok1, bok2, bok3);
            } else tab[0] = new TrojkatRoznoboczny(bok1, bok2, bok3);

        } else GUI.nieUdałoSieUtworzycTrójkąta();


    }

    public void rozpoznajFigure(String boki) {

    }
}
