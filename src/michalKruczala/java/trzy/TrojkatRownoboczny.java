package trzy;

public class TrojkatRownoboczny extends TrojkatRoznoboczny {

    public String getName() {
        return name;
    }

    String name;

    public TrojkatRownoboczny(int side1, int side2, int side3) {
        super(side1, side2, side3);
         this.name = "trojkat Rownoboczny";


    }

    @Override
    public double obliczPole(int side1, int side2, int side3) {
        return super.obliczPole(side1, side2, side3);
    }
}
