package Accessories;

public class DrumSticks extends Accessory {

    String tipMaterial;

    public DrumSticks(String name, String description, int salePrice, int purchasePrice, String tipMaterial) {
        super(name, description, salePrice, purchasePrice);
        this.tipMaterial = tipMaterial;
    }

        public String getTipMaterial() {
            return tipMaterial;
        }


}
