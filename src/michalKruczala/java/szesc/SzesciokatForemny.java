package szesc;

public class SzesciokatForemny extends Szesciokat {
    public SzesciokatForemny(int side1, int side2, int side3, int side4, int side5, int side6) {
        super(side1, side2, side3, side4, side5, side6);
    }

    @Override
    public double obliczPole(int side1, int side2, int side3, int side4, int side5, int side6) {
        return (6*(side1*side1*Math.sqrt(3)))/4;
    }

    @Override
    public String getName() {
        return "szsciakat foremny";
    }
}
