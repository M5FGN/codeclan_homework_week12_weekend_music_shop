package Accessories;

import Behaviours.ISell;

public class GuitarBag extends Accessory implements ISell {

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

    public double calculateMarkup(){
        double sale = this.getSalePrice();
        double purchase = this.getPurchasePrice();
        double markup = sale - purchase;
        return markup;
    }
}
