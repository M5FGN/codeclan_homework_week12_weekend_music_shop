package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

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

    public String playsSound(String sound) {
        return "I make a " + sound + " sound!";
    }

    public double calculateMarkup(){
        double sale = this.getSalePrice();
        double purchase = this.getPurchasePrice();
        double markup = sale - purchase;
        return markup;
    }
}
