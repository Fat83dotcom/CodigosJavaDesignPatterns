public class DirectorHyundai {
    private String brand = "Hyundai";

    public void buildHB_20(Builder builder) {
        builder.brand(this.brand)
        .id(52456)
        .model("HB_20")
        .nbrDoors(4)
        .nbrCilinders(4)
        .color("Preto");
    }
}
