package cztery;


import model.Figura;

public class Kwadrat extends Figura {

    int side4;

    public Kwadrat(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3);
        this.side4 = side4;

    }

    @Override
    public int obliczPole(int side1, int side2, int side3, int side4) {
        this.side4 = side4;
        if(side1==side2){
            return side1*side3;
        } else return side1*side2;
    }

    @Override
    public String getName() {
        return "kwadrat";
    }
}



