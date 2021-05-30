package Instruments;

public class Guitar extends Instrument {

    private int noOfStrings;
    private String bodyShape;

    public Guitar(String name, String description, double salePrice, double purchasePrice, Material material, Colour colour, Type type, int noOfStrings, String bodyShape) {
        super(name, description, salePrice, purchasePrice, material, colour, type);
        this.noOfStrings = noOfStrings;
        this.bodyShape = bodyShape;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String getBodyShape() {
        return bodyShape;
    }
}
