package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Keyboard extends Instrument implements IPlay, ISell {

    private int noOfKeys;

    public Keyboard(String name, String description, double salePrice, double purchasePrice, Material material, Colour colour, Type type, int noOfKeys) {
        super(name, description, salePrice, purchasePrice, material, colour, type);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
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
