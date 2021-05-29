package Accessories;

public class DrumSticks extends Accessory {

    private String tipMaterial;

    public DrumSticks(String name, String description, double salePrice, double purchasePrice, String tipMaterial) {
        super(name, description, salePrice, purchasePrice);
        this.tipMaterial = tipMaterial;
    }

        public String getTipMaterial() {
            return tipMaterial;
        }


}
