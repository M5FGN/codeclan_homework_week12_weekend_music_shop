package Accessories;

public class GuitarStrings extends Accessory {
    int packSize;

    public GuitarStrings(String name, String description, int salePrice, int purchasePrice, int packSize) {
        super(name, description, salePrice, purchasePrice);
        this.packSize = packSize;
    }

    public int getPackSize() {
        return packSize;
    }

}
