public class App {
    public static void main(String[] args) throws Exception {
        // Car car = new CarBuilder()
        // .id(564)
        // .brand("Ford")
        // .model("Raptor 350")
        // .nbrDoors(2)
        // .build();
        // System.out.println(car);

        DirectorChevrolet directorChev = new DirectorChevrolet();
        DirectorFord directorFord = new DirectorFord();
        DirectorHyundai directorHyundai = new DirectorHyundai();

        CarBuilder builder = new CarBuilder();

        directorChev.buildChevroletCorsa(builder);
        Car car1 = builder.build();

        directorFord.buildFordRaptor350(builder);
        Car car2 = builder.build();

        directorFord.buildFord_K(builder);
        Car car3 = builder.build();

        directorHyundai.buildHB_20(builder);
        Car car4 = builder.build();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
