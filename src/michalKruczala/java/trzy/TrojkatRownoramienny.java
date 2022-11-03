package trzy;

public class TrojkatRownoramienny extends Trojkat {

    public TrojkatRownoramienny(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    @Override
    public double obliczPole(int side1, int side2, int side3) {
        return super.obliczPole(side1, side2, side3);
    }

    @Override
    public String getName() {
        return "Trójkąt Równoramienny";
    }
}
