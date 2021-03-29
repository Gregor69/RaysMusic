import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import stockitems.*;

import static org.junit.Assert.assertEquals;


public class ShopTest {

    Shop shop;
    ISell drumKit;
    ISell guitar;
    ISell guitarStrings;
    ISell trumpet;





    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        drumKit = new DrumKit(449.99, 235.00, "Resin", InstrumentType.PERCUSSION, 11);
        guitar = new Guitar(99.99, 50.55, "Wood", InstrumentType.STRING, 6);
        guitarStrings = new GuitarStrings(14.99, 5.99, 6);
        trumpet = new Trumpet(119.99, 55.66, "Brass", InstrumentType.BRASS, 4);

    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canAddStock(){
       shop.addStock(guitar);
       assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(drumKit);
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canGetTotalPotentialProfit(){
        shop.addStock(drumKit);
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        shop.addStock(trumpet);
        assertEquals(336.0, shop.totalPotentialProfit(),0.01);
    }




}
