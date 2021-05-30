import Accessories.GuitarBag;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarBagTest {

    GuitarBag guitarBag1;
    GuitarBag guitarBag2;
    GuitarBag guitarBag3;

    @Before
    public void setUp(){
        guitarBag1 = new GuitarBag("Mono 180", "A light weight shell that provides first class travel for your guitar.", 49.99, 23.99, "black", "nylon" );
        guitarBag2 = new GuitarBag("TourTech", "Making it easy to carry your guitar from gig to gig.", 59.99, 34.99, "gray", "nylon" );
    }

    @Test
    public void hasName(){
        assertEquals("Mono 180", guitarBag1.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("Making it easy to carry your guitar from gig to gig.", guitarBag2.getDescription());
    }

    @Test
    public void hasSalePrice(){
        assertEquals(49.99, guitarBag1.getSalePrice(),0.00);
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(34.99, guitarBag2.getPurchasePrice(), 0.00);
    }

    @Test
    public void hasColour(){
        assertEquals("black", guitarBag1.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("nylon", guitarBag2.getMaterial());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(25.00, guitarBag2.calculateMarkup(),0.00);
    }
}
