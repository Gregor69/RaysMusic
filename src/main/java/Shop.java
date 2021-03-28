import behaviours.ISell;

import java.util.ArrayList;

public class Shop  {

    private String name;
    private ArrayList<ISell> stock;

    public Shop (String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>(stock);
    }

    public String getName() {
        return name;
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addStock(ISell stock){
        this.stock.add(stock);
    }

    public void removeStock(ISell stock){
        this.stock.remove(stock);
    }

    public double calculateMarkUp() {
        return 0;
    }


}
