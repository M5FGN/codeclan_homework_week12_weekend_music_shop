package Instruments;

public class Instrument {

    private String name;
    private String description;
    private int salePrice;
    private int purchasePrice;
    private String material;
    private String colour;
    private String instrumentType;

    public Instrument(String name, String description, int salePrice, int purchasePrice, String material, String colour, String instrumentType) {
        this.name = name;
        this.description = description;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
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

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getInstrumentType() {
        return instrumentType;
    }
}
