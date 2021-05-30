package Accessories;

import Behaviours.ISell;

public abstract class Accessory implements ISell {

    private String name;
    private String description;
    private double salePrice;
    private double purchasePrice;

    public Accessory(String name, String description, double salePrice, double purchasePrice) {
        this.name = name;
        this.description = description;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
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
}
