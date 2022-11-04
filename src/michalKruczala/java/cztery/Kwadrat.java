package cztery;


import intefrejsy.Metodki;
import model.Figura;

public class Kwadrat extends Czworokat implements Metodki {



    public Kwadrat(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3,side4);


    }

    @Override
    public double obliczPole(int side1, int side2, int side3, int side4, int side5, int side6) {
        if (side1 == side2) {
            return side1 * side3;
        } else return side1 * side2;

    }

    @Override
    public String getName() {
        return "kwadrat";
    }

}





