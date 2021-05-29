package Accessories;

public class Accessory {

    String name;
    String description;
    int salePrice;
    int purchasePrice;

    public Accessory(String name, String description, int salePrice, int purchasePrice) {
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

    public int getSalePrice() {
        return salePrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }
}
