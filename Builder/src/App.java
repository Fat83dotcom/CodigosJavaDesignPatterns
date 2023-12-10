public class App {
    public static void main(String[] args) throws Exception {
        // Maneira simplificada e sem o uso de Directors.
        // Car car = new CarBuilder()
        // .id(564)
        // .brand("Ford")
        // .model("Raptor 350")
        // .nbrDoors(2)
        // .build();
        // System.out.println(car);

        // Concrete Builder: Constrói e monta carros e fornece uma interface para recuperação dos produtos.
        CarBuilder builder = new CarBuilder();

        // Directors: Constrói os objetos com a interface Builder
        DirectorChevrolet directorChev = new DirectorChevrolet();
        DirectorFord directorFord = new DirectorFord();
        DirectorHyundai directorHyundai = new DirectorHyundai();

        //Products: Representa o objeto complexo contruído.
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
