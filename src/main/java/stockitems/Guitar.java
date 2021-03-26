package stockitems;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instruments implements IPlay, ISell {

    private int strings;
    private IPlay iplay;


    public Guitar(double sellingPrice, double boughtPrice, String material, InstrumentType type, int strings){
        super(sellingPrice, boughtPrice, material, type);
        this.strings = strings;
        this.iplay = iplay;

    }



    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String playInstrument() {
        return "strum, strum";
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBoughtPrice();
    }
}
