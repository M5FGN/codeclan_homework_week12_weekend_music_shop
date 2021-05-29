package Accessories;

public class GuitarBag extends Accessory{

    private String colour;
    private String material;

    public GuitarBag(String name, String description, double salePrice, double purchasePrice, String colour, String material) {
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
