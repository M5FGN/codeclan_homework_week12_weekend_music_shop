package Instruments;

public class Guitar extends Instrument {

    int noOfStrings;
    String bodyShape;

    public Guitar(String name, String description, int salePrice, int purchasePrice, String material, String colour, String instrumentType, int noOfStrings, String bodyShape) {
        super(name, description, salePrice, purchasePrice, material, colour, instrumentType);
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
