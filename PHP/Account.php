<?php
class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;
    //creamos nuestro método constructor
    public function __CONSTRUCT($name, $document) {
        $this->name = $name;
        $this->document = $document;
    }
}
//Creamoas nuestra clase con los atributos indicados
?>