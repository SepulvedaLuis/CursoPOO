package Java;

class Main {
    public static void main(String[] args) {
        // System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "CDB1235"), 4);
        // Lo que ganamos definiendo el método contructor fue que reducir líneas de
        // código y podemos
        // encontrar que al definir nuestro objeto car le debemos pasar nuestros datos
        // definidos en
        // el contrusctor y como tenemos un atributo heredado lo que hacemos es crear un
        // objeo de Account
        // y llamarlo en Car
        car.printDataCar(); // Con este método imprimimos los datos de nuestro objeto car

        // Car car2 = new Car();
        // car2.license = "QWE567";
        // car2.driver = "Luis Gonzalez";
        // car2.passegender = 3;
        // car2.printDataCar(); // Con este método imprimimos los datos del objeto car2
    }
}
// Nuestro primer ejemplo de clases en Java en la cual imprimimos un mensaje