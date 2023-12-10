public class DirectorFord {
    private String brand = "Ford";

    //Objeto sendo construído a partir da interface Builder.
    public void buildFordRaptor350(Builder builder) {
        builder.brand(this.brand)
        .id(865)
        .nbrDoors(2)
        .model("Raptor 350");
    }

    public void buildFord_K (Builder builder) {
        builder.brand(this.brand)
        .id(89588)
        .nbrCilinders(4)
        .nbrDoors(4)
        .model("K");
    }
}
