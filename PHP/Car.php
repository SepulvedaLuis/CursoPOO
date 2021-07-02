<?php
class Car {
  public $id;
  public $license;
  public $driver;
  public $passenger;
    //generamos el método contstructor del caso
  public function __construct($license, $driver){
    $this->license = $license;
    $this->driver = $driver;
  }

  public function printDataCar() {
    echo "Licencia: $this->license Driver: ".$this->driver->name;
  }
}
//Creamos nuestras clase con los atributos indicados
?>