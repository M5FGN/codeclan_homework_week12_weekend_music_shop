package Accessories;

import Behaviours.ISell;

public class GuitarStrings extends Accessory implements ISell {
    private int packSize;

    public GuitarStrings(String name, String description, double salePrice, double purchasePrice, int packSize) {
        super(name, description, salePrice, purchasePrice);
        this.packSize = packSize;
    }

    public int getPackSize() {
        return packSize;
    }

    public double calculateMarkup(){
        double sale = this.getSalePrice();
        double purchase = this.getPurchasePrice();
        double markup = sale - purchase;
        return markup;
    }
}
