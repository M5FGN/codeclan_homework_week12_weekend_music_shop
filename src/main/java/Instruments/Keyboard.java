package Instruments;

public class Keyboard extends Instrument {

    private int noOfKeys;

    public Keyboard(String name, String description, double salePrice, double purchasePrice, Material material, Colour colour, Type type, int noOfKeys) {
        super(name, description, salePrice, purchasePrice, material, colour, type);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
}
