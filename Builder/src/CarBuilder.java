public class CarBuilder implements Builder {
    private int id;
    private int nbrDoors;
    private int nbrCilinders;
    private String brand;
    private String model;
    private String color;
    private String wheelsType;


    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }


    public CarBuilder nbrDoors(int nbrDoors) {
        this.nbrDoors = nbrDoors;
        return this;
    }


    public CarBuilder nbrCilinders(int nbrCilinders) {
        this.nbrCilinders = nbrCilinders;
        return this;
    }


    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }


    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }


    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }


    public CarBuilder wheelsType(String wheelsType) {
        this.wheelsType = wheelsType;
        return this;
    }


    public Car build() {
        return new Car(id, nbrDoors, nbrCilinders, brand, model, color, wheelsType);
    }
    
}

