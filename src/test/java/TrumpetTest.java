import org.junit.Before;
import org.junit.Test;
import stockitems.InstrumentType;
import stockitems.Trumpet;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(119.99, 55.66, "Brass", InstrumentType.BRASS, 4);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(119.99, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(55.66, trumpet.getBoughtPrice(), 0.01);
    }

    @Test
    public void setSellingPrice(){
        trumpet.setSellingPrice(125.00);
        assertEquals(125.00, trumpet.getSellingPrice(),0.01);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void hasValves(){
        assertEquals(4, trumpet.getValves());
    }

    @Test
    public void setValves(){
        trumpet.setValves(3);
        assertEquals(3, trumpet.getValves());
    }

    @Test
    public void canPlay(){
        assertEquals("braaaaapp", trumpet.playInstrument());
    }

    @Test
    public void calculateMarkUp(){
        assertEquals(64.33, trumpet.calculateMarkUp(), 0.01);
    }




}
