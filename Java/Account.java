package Java;

class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    // método contructor
    public Account(String name, String document) {
        this.name = name;
        this.document = document;
        // siempre usamos la palabra reservada this para el método contructor
    }
}
// Creamos una clase con valores enteros y string