class Car{ //Creamos nuestra clase y meodo contrusctor con EcmaScript6

    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar() {
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
    }
    
}

// function Car(license, driver, passenger) { //Indicandolo los atributos que deseamos ya generamos nuestro
//     this.id;                      ///método contrusctor y debemos instanciar cada valor
//     this.license = license;
//     this.driver = driver;
//     this.passenger = passenger;
// }
// //Creamos una función o método en nuestra clase
// Car.prototype.printDataCar = function (){
//     console.log(this.driver)
//     console.log(this.driver.name)
//     console.log(this.driver.document)
//     console.log(this.passenger)
// }
// //Clase creada con sus atributos