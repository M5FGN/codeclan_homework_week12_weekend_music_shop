import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void setUp(){
        guitar1 = new Guitar("Gibson 1958", "Historically authentic recreation of the original.", 4199.99, 1299.99, Material.WOOD, Colour.BLACK, Type.STRING, 6, "LP");
        guitar2 = new Guitar("Rickenbacker Ltd Edition 360", "limited edition version of a truly iconic guitar.", 3199.99, 899.99, Material.WOOD, Colour.RED, Type.STRING, 6, "LPS");

    }

    @Test
    public void hasName() {
        assertEquals("Gibson 1958", guitar1.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("limited edition version of a truly iconic guitar.", guitar2.getDescription());
    }

    @Test
    public void hasSalePrice(){
        assertEquals(4199.99, guitar1.getSalePrice(), 0.00);
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(899.99, guitar2.getPurchasePrice(), 0.00);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, guitar2.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals(Colour.BLACK, guitar1.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, guitar2.getType());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, guitar1.getNoOfStrings());
    }

    @Test
    public void hasBodyShape() {
        assertEquals("LPS", guitar2.getBodyShape());
    }
}
