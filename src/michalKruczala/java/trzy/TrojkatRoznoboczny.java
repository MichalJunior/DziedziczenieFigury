package trzy;

public class TrojkatRoznoboczny extends TrojkatRownoboczny {



    public TrojkatRoznoboczny(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    @Override
    public double obliczPole(int side1, int side2, int side3) {
        return super.obliczPole(side1, side2, side3);
    }

    @Override
    public String getName() {
        return "Trójkąt Różnoboczny";
    }
}



