import behaviours.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return this.stock.size();
    }

    public double calculateMarkUp() {
        return 0;
    }
}
