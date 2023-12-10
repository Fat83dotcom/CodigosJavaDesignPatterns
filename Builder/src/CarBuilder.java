public class CarBuilder implements Builder {
    //Atributos comuns entre qualquer carro.
    private int id;
    private int nbrDoors;
    private int nbrCilinders;
    private String brand;
    private String model;
    private String color;
    private String wheelsType;

    //Setters especiais herdados da interface Builder.
    public Builder id(int id) {
        this.id = id;
        return this;
    }

    public Builder nbrDoors(int nbrDoors) {
        this.nbrDoors = nbrDoors;
        return this;
    }

    public Builder nbrCilinders(int nbrCilinders) {
        this.nbrCilinders = nbrCilinders;
        return this;
    }

    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public Builder model(String model) {
        this.model = model;
        return this;
    }

    public Builder color(String color) {
        this.color = color;
        return this;
    }

    public Builder wheelsType(String wheelsType) {
        this.wheelsType = wheelsType;
        return this;
    }

    //Método/interface responsável por criar os produtos deste Concrete Builder.
    public Car build() {
        return new Car(id, nbrDoors, nbrCilinders, brand, model, color, wheelsType);
    }
    
}

