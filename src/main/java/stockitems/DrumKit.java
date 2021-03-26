package stockitems;

import behaviours.IPlay;
import behaviours.ISell;

public class DrumKit extends Instruments implements IPlay, ISell {

    private int drums;


    public DrumKit(double sellingPrice, double boughtPrice, String material, InstrumentType type, int drums){
        super(sellingPrice, boughtPrice, material, type);
        this.drums = drums;
    }


    public int getDrums() {
        return drums;
    }

    public void setDrums(int drums) {
        this.drums = drums;
    }


    public String playInstrument() {
        return "boom, tada, boom";
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBoughtPrice();
    }
}
