import org.junit.Before;
import org.junit.Test;
import stockitems.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(14.99, 5.99, 6);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(14.99, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(5.99, guitarStrings.getBoughtPrice(), 0.01);
    }

    @Test
    public void setSellingPrice(){
        guitarStrings.setSellingPrice(15.99);
        assertEquals(15.99, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void hasPackSize(){
        assertEquals(6, guitarStrings.getPackSize());
    }
}
