package model;


import intefrejsy.Metodki;

public abstract class Figura {
    int side1;
    int side2;
    int side3;
    int side4;
    int side5;
    int Side6;


    public Figura(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    public double obliczPole(int side1, int side2, int side3, int side4, int side5, int side6){
        return 0;
    }
    public String getName(){
        return "o";
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public int getSide4() {
        return side4;
    }

    public int getSide5() {
        return side5;
    }

    public int getSide6() {
        return Side6;
    }
}
