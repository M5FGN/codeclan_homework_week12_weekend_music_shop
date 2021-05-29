package Accessories;

public class GuitarBags extends Accessory{

    String colour;
    String material;

    public GuitarBags(String name, String description, int salePrice, int purchasePrice, String colour, String material) {
        super(name, description, salePrice, purchasePrice);
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
