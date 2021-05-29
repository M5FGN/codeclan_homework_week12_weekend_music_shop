package Instruments;

public class Keyboards extends Instrument {

    int noOfKeys;

    public Keyboards(String name, String description, int salePrice, int purchasePrice, String material, String colour, String instrumentType, int noOfKeys) {
        super(name, description, salePrice, purchasePrice, material, colour, instrumentType);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
}
