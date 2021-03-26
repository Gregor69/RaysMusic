package stockitems;

import behaviours.ISell;

public class GuitarStrings extends StockItem implements ISell {

    public int getPackSize;
    private int packSize;

    public GuitarStrings(double sellingPrice, double boughtPrice, int packSize){
        super(sellingPrice, boughtPrice);
        this.packSize = packSize;
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBoughtPrice();
    }

    public int getPackSize() {
        return packSize;
    }
}
