
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import stockitems.DrumKit;
import stockitems.Guitar;
import stockitems.InstrumentType;


import static org.junit.Assert.assertEquals;


public class ShopTest {

    Shop shop;
    Guitar guitar;
    DrumKit drumKit;



    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        shop.addStock(guitar);

    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canAddStock(){
       shop.addStock(guitar);
       assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(drumKit);
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(3, shop.getStockCount());
    }




}
