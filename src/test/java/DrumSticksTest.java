import Accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks1;
    DrumSticks drumSticks2;

    @Before
    public void setUp(){
        drumSticks1 = new DrumSticks("Nova 5A", "Wooden teardrop tip provides a rich cymbal sound", 4.99, 1.99, "wood");
        drumSticks2 = new DrumSticks("Soft Mallet", "Dual Purpose Mallet and Conventional Stick Tips", 8.99, 4.99, "nylon");
    }

    @Test
    public void hasName() {
        assertEquals("Nova 5A", drumSticks1.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("Dual Purpose Mallet and Conventional Stick Tips", drumSticks2.getDescription());
    }

    @Test
    public void hasSalePrice() {
        assertEquals(4.99, drumSticks1.getSalePrice(), 0.00);
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(4.99, drumSticks2.getPurchasePrice(), 0.00);
    }

    @Test
    public void hasTipMaterial() {
        assertEquals("nylon", drumSticks2.getTipMaterial());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(3.00, drumSticks1.calculateMarkup(),0.00);
    }

}
