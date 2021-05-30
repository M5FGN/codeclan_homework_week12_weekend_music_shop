package Instruments;

public class Drums extends Instrument {

    private int kitSize;

    public Drums(String name, String description, double salePrice, double purchasePrice, Material material, Colour colour, Type type, int kitSize) {
        super(name, description, salePrice, purchasePrice, material, colour, type);
        this.kitSize = kitSize;
    }

    public int getKitSize() {
        return kitSize;
    }

}
