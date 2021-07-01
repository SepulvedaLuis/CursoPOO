package Java;

class Car {
    Integer id;
    String license;
    String driver;
    Integer passegender;

    void printDataCar() { // Creamos un método para imprimir los datos creados
        System.out.println("License: " + license + "\n" + "Driver: " + driver + "\n" + "Passenger: " + passegender);
    }
}
// Clase car con ID tipo entero y el número de pasageros, adicional dos strings
// para license y driver