package stockitems;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Instruments implements IPlay, ISell {

    private int valves;
    private IPlay iplay;

    public Trumpet(double sellingPrice, double boughtPrice, String material, InstrumentType type, int valves) {
        super(sellingPrice, boughtPrice, material, type);
        this.valves = valves;
        this.iplay = iplay;
    }


    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public String playInstrument() {
        return "braaaaapp";
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBoughtPrice();
    }

}
