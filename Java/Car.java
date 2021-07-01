package Java;

class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegender;

    // Vamos a crear nuestro método constructor en java
    public Car(String license, Account driver, Integer passegender) {
        this.license = license;
        this.driver = driver;
        this.passegender = passegender;
        // Debemos siempre usar la palabra reservada this.
    }

    void printDataCar() { // Creamos un método para imprimir los datos creados
        System.out.println(
                "License: " + license + "\n" + "Name Driver: " + driver.name + "\n" + "Passenger: " + passegender);
    } // para pasar el nombre solo debemos entonces que llamar el dato que necesitamos
      // de la clase
      // Account y debemos hacerlo con el atributoClaseHija.atributoClasePadre

}
