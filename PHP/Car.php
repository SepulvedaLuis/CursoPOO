<?php
class Car {
    public $id;
    public $license;
    public $driver;
    public $passengers;
    //generamos el método contstructor del caso
    public function __CONSTRUCT($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
      }
    
      public function printDataCar() {
        echo "Driver: {$this->driver->name}";
    }
}
//Creamos nuestras clase con los atributos indicados
?>