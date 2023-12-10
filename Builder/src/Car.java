public class Car {
    //Objeto complexo que poderá ser construído da forma que mais convier.
    private final int id;
    private final int nbrDoors;
    private final int nbrCilinders;
    private final String brand;
    private final String model;
    private final String color;
    private final String wheelsType;
     
    // O construtor deve ser protegido para que a classe não seja instanciada em outra parte do programa.
    protected Car(int id, int nbrDoors, int nbrCilinders, String brand, String model, String color, String wheelsType) {
        this.id = id;
        this.nbrDoors = nbrDoors;
        this.nbrCilinders = nbrCilinders;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.wheelsType = wheelsType;
    }

    public String toString() {
        return "Car {id: %d , nbrDoors: %d, nbrCilinders: %d, brand: %s, model: %s, color: %s, wheelsType: %s}"
        .formatted(id, nbrDoors, nbrCilinders, brand, model, color, wheelsType); 
    }
}
