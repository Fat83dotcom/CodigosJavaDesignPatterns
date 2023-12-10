public class DirectorChevrolet {
    private String brand = "Chevrolet";

    //Objeto sendo construído a partir da interface Builder.
    public void buildChevroletCorsa(Builder builder) {
        builder.brand(this.brand)
        .id(1245510)
        .nbrCilinders(4)
        .model("Corsa");
    }
    
}
