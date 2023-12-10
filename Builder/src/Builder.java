public interface Builder {
    //Interface abstrata que conecta os Directors e seus Concrete Builders e define as partes dos produtos.
    Builder id(int id);
    Builder nbrDoors(int nbrDoors);
    Builder nbrCilinders(int nbrCilinders);
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    Builder wheelsType(String wheelsType);
}
