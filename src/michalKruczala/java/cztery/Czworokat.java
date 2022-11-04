package cztery;

import model.Figura;

public class Czworokat extends Figura {
    int side4;

    public Czworokat(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3);
        this.side4 = side4;
    }


    @Override
    public String getName() {
        return "czworokat";
    }

    @Override
    public double obliczPole(int side1, int side2, int side3, int side4) {
        this.side4 = side4;
        System.out.println("nie ma pola XD");
        return 0;


    }
}
