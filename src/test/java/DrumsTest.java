import Instruments.Colour;
import Instruments.Drums;
import Instruments.Material;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums1;
    Drums drums2;

    @Before
    public void setUp(){
        drums1 = new Drums("Roland TD-27K", "An immersive sound and fantastic response.", 1299.99, 399.99, Material.METAL, Colour.BLACK, Type.DRUMS, 8);
        drums2 = new Drums("Tourtech TT-22", "High end features at low end prices.", 599.99, 199.99, Material.METAL, Colour.BLACK, Type.DRUMS, 7);
    }

    @Test
    public void hasName() {
        assertEquals("Roland TD-27K", drums1.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("High end features at low end prices.", drums2.getDescription());
    }

    @Test
    public void hasSalePrice(){
        assertEquals(599.99, drums2.getSalePrice(), 0.00);
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(399.99, drums1.getPurchasePrice(), 0.00);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.METAL, drums1.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals(Colour.BLACK, drums2.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.DRUMS, drums2.getType());
    }

    @Test
    public void hasKitSize(){
        assertEquals(7, drums2.getKitSize());
    }

    @Test
    public void canPlaySound() {
        assertEquals("I make a boom sound!", drums1.playsSound("boom"));
    }

    @Test
    public void calculateMarkup() {
        assertEquals(400.00, drums2.calculateMarkup(),0.00);
    }
}
