import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        guitarStrings = new GuitarStrings("Martin", "Strings offer incredible performance while reducing wear and tear of your instrument.", 15.99, 6.99, 7);
    }

    @Test
    public void hasName(){
        assertEquals("Martin", guitarStrings.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("Strings offer incredible performance while reducing wear and tear of your instrument.", guitarStrings.getDescription());
    }

    @Test
    public void hasSalePrice() {
        assertEquals(15.99, guitarStrings.getSalePrice(), 0.00);
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(6.99, guitarStrings.getPurchasePrice(), 0.00);
    }

    @Test
    public void hasPackSize() {
        assertEquals(7, guitarStrings.getPackSize());
    }

}
