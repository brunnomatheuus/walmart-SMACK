package walmart;

import java.util.ArrayList;

public class Produtos {
    public final ArrayList<Produto> array;
    public double min = 0;
    public double max = 0;

    public Produtos() {
        this.array = new ArrayList<>();
    }

    public Produtos(double min, double max){
        this.array = new ArrayList<>();
        this.min = min;
        this.max = max;
    }
}
