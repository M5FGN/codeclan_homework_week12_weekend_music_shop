package Accessories;

public class GuitarStrings extends Accessory {
    private int packSize;

    public GuitarStrings(String name, String description, double salePrice, double purchasePrice, int packSize) {
        super(name, description, salePrice, purchasePrice);
        this.packSize = packSize;
    }

    public int getPackSize() {
        return packSize;
    }

}
