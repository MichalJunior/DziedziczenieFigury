package trzy;

public class Trojkat {
    public int side1;
    public int side2;
    public int side3;
    double pole;



    public Trojkat(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.pole = obliczPole(side1, side2, side3);

    }
    public String getName(){
        return null;
    }

    public double obliczPole(int side1, int side2, int side3) {
        int polowaObwodu = (side1 + side2 + side3) / 2;
        return Math.sqrt(polowaObwodu * (polowaObwodu - side2) * (polowaObwodu - side1) * (polowaObwodu - side3));
    }
}