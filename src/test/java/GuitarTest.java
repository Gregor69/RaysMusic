import org.junit.Before;
import org.junit.Test;
import stockitems.Guitar;
import stockitems.InstrumentType;


import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(99.99, 50.55, "Wood", InstrumentType.STRING, 6);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(99.99, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(50.55, guitar.getBoughtPrice(), 0.01);
    }

    @Test
    public void setSellingPrice(){
        guitar.setSellingPrice(110.99);
        assertEquals(110.99, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void setStrings(){
        guitar.setStrings(12);
        assertEquals(12, guitar.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("strum, strum", guitar.playInstrument());
    }

    @Test
    public void calculateMarkUp(){
        assertEquals(49.44, guitar.calculateMarkUp(),0.01);
    }



}
