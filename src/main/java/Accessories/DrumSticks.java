package Accessories;

import Behaviours.ISell;

public class DrumSticks extends Accessory implements ISell {

    private String tipMaterial;

    public DrumSticks(String name, String description, double salePrice, double purchasePrice, String tipMaterial) {
        super(name, description, salePrice, purchasePrice);
        this.tipMaterial = tipMaterial;
    }

        public String getTipMaterial() {
            return tipMaterial;
        }


    public double calculateMarkup(){
        double sale = this.getSalePrice();
        double purchase = this.getPurchasePrice();
        double markup = sale - purchase;
        return markup;
    }
}
