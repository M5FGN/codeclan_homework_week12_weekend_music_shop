import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

Keyboard keyboard1;
Keyboard keyboard2;

@Before
    public void setUp(){
    keyboard1 = new Keyboard("Roland Go", "Premium piano performance in a compact, portable and affordable instrument.", 400.99, 199.99, Material.PLASTIC, Colour.BLACK, Type.KEYS, 88);
    keyboard2 = new Keyboard("Native Instruments Komplete", "Offering best-in-class performance.", 1600.99, 999.99, Material.PLASTIC, Colour.BLACK, Type.KEYS, 25);
}

    @Test
    public void hasName() {
        assertEquals("Roland Go", keyboard1.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("Offering best-in-class performance.", keyboard2.getDescription());
    }

    @Test
    public void hasSalePrice(){
        assertEquals(400.99, keyboard1.getSalePrice(), 0.00);
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(999.99, keyboard2.getPurchasePrice(), 0.00);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.PLASTIC, keyboard2.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals(Colour.BLACK, keyboard1.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(Type.KEYS, keyboard1.getType());
    }

    @Test
    public void hasNoOfKeys () {
    assertEquals(25, keyboard2.getNoOfKeys());
    }

    @Test
    public void canPlaySound() {
        assertEquals("I make a click sound!", keyboard1.playsSound("click"));
    }

}
