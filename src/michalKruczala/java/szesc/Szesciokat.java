package szesc;

import piec.Pieciokat;

public class Szesciokat extends Pieciokat {
    int side6;

    public Szesciokat(int side1, int side2, int side3, int side4, int side5, int side6) {
        super(side1, side2, side3, side4, side5);
        this.side6 = side6;
    }

    @Override
    public double obliczPole(int side1, int side2, int side3, int side4, int side5, int side6) {
        return 0;
    }

    @Override
    public int obliczObwód(int side1, int side2, int side3, int side4, int side5, int side6) {
        return side1 + side2 + side3 + side4 + side5 + side6;
    }

    @Override
    public String getName() {
        return "Jakis szesciokat";
    }

    @Override
    public int getSide6() {
        return side6;
    }
}
