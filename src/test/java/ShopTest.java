import Accessories.DrumSticks;
import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumSticks1;
    DrumSticks drumSticks2;
    Guitar guitar1;
    Guitar guitar2;
    Keyboard keyboard;


    @Before
    public void setUp() {
        shop = new Shop("Mary's Music");

        drumSticks1 = new DrumSticks("Nova 5A", "Wooden teardrop tip provides a rich cymbal sound", 4.99, 1.99, "wood");
        drumSticks2 = new DrumSticks("Soft Mallet", "Dual Purpose Mallet and Conventional Stick Tips", 8.99, 4.99, "nylon");
        guitar1 = new Guitar("Gibson 1958", "Historically authentic recreation of the original.", 4199.99, 1299.99, Material.WOOD, Colour.BLACK, Type.STRING, 6, "LP");
        guitar2 = new Guitar("Rickenbacker Ltd Edition 360", "limited edition version of a truly iconic guitar.", 3199.99, 899.99, Material.WOOD, Colour.RED, Type.STRING, 6, "LPS");
        keyboard = new Keyboard("Roland Go", "Premium piano performance in a compact, portable and affordable instrument.", 499.99, 199.99, Material.PLASTIC, Colour.BLACK, Type.KEYS, 88);

    }

    @Test
    public void hasName(){
        assertEquals("Mary's Music", shop.getName());
    }

    @Test
    public void hasEmptyShop(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock(){
        shop.addStock(drumSticks1);
        shop.addStock(drumSticks2);
        shop.addStock(guitar1);
        shop.addStock(guitar2);
        shop.addStock(keyboard);
        assertEquals(5, shop.stockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(guitar1);
        shop.addStock(guitar2);
        shop.removeStock(guitar2);
        assertEquals(1, shop.stockCount());
    }



}
