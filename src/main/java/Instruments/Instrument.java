package Instruments;

public class Instrument {

    private String name;
    private String description;
    private double salePrice;
    private double purchasePrice;
    private Material material;
    private Colour colour;
    private Type type;

    public Instrument(String name, String description, double salePrice, double purchasePrice, Material material, Colour colour, Type type) {
        this.name = name;
        this.description = description;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public Material getMaterial() {
        return material;
    }

    public Colour getColour() {
        return colour;
    }

    public Type getType() {
        return type;
    }
}
