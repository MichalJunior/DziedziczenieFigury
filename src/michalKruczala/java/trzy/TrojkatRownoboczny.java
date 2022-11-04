package trzy;

import model.Figura;

public class TrojkatRownoboczny extends TrojkatRoznoboczny {


    public TrojkatRownoboczny(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }



    @Override
    public String getName() {
        return "Trojkat Równoboczny";
    }

}
