package cztery;

import intefrejsy.Metodki;
import model.Figura;

import javax.xml.crypto.dsig.Manifest;

public class Czworokat extends Figura implements Metodki {
    int side4;

    public Czworokat(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3);
        this.side4 = side4;
    }

    @Override
    public double obliczPole(int side1, int side2, int side3, int side4, int side5, int side6) {
        return 0;
    }

    @Override
    public String getName() {
        return "Jakis czworokoat";
    }

    @Override
    public int getSide1() {
        return super.getSide1();
    }

    @Override
    public int getSide2() {
        return super.getSide2();
    }

    @Override
    public int getSide3() {
        return super.getSide3();
    }


}

