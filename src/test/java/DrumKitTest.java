import org.junit.Before;
import org.junit.Test;
import stockitems.DrumKit;
import stockitems.InstrumentType;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void before(){
        drumKit = new DrumKit(449.99, 235.00, "Resin", InstrumentType.PERCUSSION, 11);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(449.99, drumKit.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(235.00, drumKit.getBoughtPrice(), 0.01);
    }

    @Test
    public void setSellingPrice(){
        drumKit.setSellingPrice(500.00);
        assertEquals(500.00, drumKit.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Resin", drumKit.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.PERCUSSION, drumKit.getType());
    }

    @Test
    public void hasDrums(){
        assertEquals(11, drumKit.getDrums());
    }

    @Test
    public void setDrums(){
        drumKit.setDrums(12);
        assertEquals(12, drumKit.getDrums());
    }

    @Test
    public void canPlay(){
        assertEquals("boom, tada, boom", drumKit.playInstrument());
    }

    @Test
    public void calculateMarkUp(){
        assertEquals(214.99, drumKit.calculateMarkUp(),0.01);
    }


}
