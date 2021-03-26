package stockitems;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instruments extends StockItem implements IPlay, ISell {

    private String material;
    private InstrumentType type;


    public Instruments (double sellingPrice, double boughtPrice, String material, InstrumentType type) {
        super(sellingPrice, boughtPrice);
        this.material = material;
        this.type = type;


    }

    public String getMaterial() {
        return material;
    }


    public InstrumentType getType() {
        return type;
    }
}
