package Instruments;

public class Drums extends Instrument {

    int kitSize;

    public Drums(String name, String description, int salePrice, int purchasePrice, String material, String colour, String instrumentType, int kitSize) {
        super(name, description, salePrice, purchasePrice, material, colour, instrumentType);
        this.kitSize = kitSize;
    }

    public int getKitSize() {
        return kitSize;
    }
}
