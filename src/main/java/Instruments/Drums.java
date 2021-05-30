package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Drums extends Instrument implements IPlay, ISell {

    private int kitSize;

    public Drums(String name, String description, double salePrice, double purchasePrice, Material material, Colour colour, Type type, int kitSize) {
        super(name, description, salePrice, purchasePrice, material, colour, type);
        this.kitSize = kitSize;
    }

    public int getKitSize() {
        return kitSize;
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
