package Java;

class Main {
    public static void main(String[] args) {
        // System.out.println("Hola Mundo");
        Car car = new Car(); // Por defecto toda clase genera el método contructor de forma automática
        car.license = "AMQ123"; // Asignamos datos
        car.driver = "Andres Herrera";
        car.passegender = 4;
        car.printDataCar(); // Con este método imprimimos los datos de nuestro objeto car

        Car car2 = new Car();
        car2.license = "QWE567";
        car2.driver = "Luis Gonzalez";
        car2.passegender = 3;
        car2.printDataCar(); // Con este método imprimimos los datos del objeto car2
    }
}
// Nuestro primer ejemplo de clases en Java en la cual imprimimos un mensaje