package stockitems;

public abstract class StockItem {

    private double sellingPrice;
    private double boughtPrice;

    public StockItem(double sellingPrice, double boughtPrice){
        this.sellingPrice = sellingPrice;
        this.boughtPrice = boughtPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }
}
