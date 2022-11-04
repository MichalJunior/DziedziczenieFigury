package piec;

import cztery.Czworokat;

public class Pieciokat extends Czworokat {
    int side5;

    public Pieciokat(int side1, int side2, int side3, int side4, int side5) {
        super(side1, side2, side3, side4);
        this.side5 = side5;
    }

    @Override
    public double obliczPole(int side1, int side2, int side3, int side4, int side5, int side6) {
        return 0;
    }

    @Override
    public int obliczObwód(int side1, int side2, int side3, int side4, int side5, int side6) {
        return side1 + side2 + side3 + side4 + side5;
    }

    @Override
    public String getName() {
        return "jakis pieciokot";
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

    @Override
    public int getSide4() {
        return super.getSide4();
    }

    @Override
    public int getSide5() {
        return side5;
    }
}
