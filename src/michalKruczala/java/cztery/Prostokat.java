package cztery;

import model.Figura;

public class Prostokat extends Figura {
    int side4;

    public Prostokat(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3);
        this.side4 = side4;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double obliczPole(int side1, int side2, int side3, int side4) {
        if (side1 == side2) {
            return side1 * side3;
        } else return side1 * side2;
    }
}
