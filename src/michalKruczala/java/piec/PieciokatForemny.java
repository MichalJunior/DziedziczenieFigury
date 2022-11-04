package piec;

public class PieciokatForemny extends Pieciokat {
    public PieciokatForemny(int side1, int side2, int side3, int side4, int side5) {
        super(side1, side2, side3, side4, side5);
    }

    @Override
    public String getName() {
        return "pieciokat foremny";
    }

    @Override
    public double obliczPole(int side1, int side2, int side3, int side4, int side5, int side6) {
        return (Math.sqrt(25+10*Math.sqrt(5))/4)*side1*side1;
    }
}
