package Java;

//Esta clase va heredar atributos de la clase Car
class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, Integer passegender, String brand, String model) {
        super(license, driver, passegender);
        this.brand = brand;
        this.model = model;

    }
}
