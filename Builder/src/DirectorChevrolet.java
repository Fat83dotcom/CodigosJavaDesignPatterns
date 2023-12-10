public class DirectorChevrolet {
    private String brand = "Chevrolet";

    public void buildChevroletCorsa(Builder builder) {
        builder.brand(this.brand)
        .id(1245510)
        .nbrCilinders(4)
        .model("Corsa");
    }
    
}
