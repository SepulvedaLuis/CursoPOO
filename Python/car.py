from account import Account
#Importamos la clase Account para nuestro uso 

class Car:
    id          = int
    license     = str
    driver      = Account("","")
    passegender = int

    def __init__(self, license, driver):
        self.license    = license
        self.driver     = driver

# Lo que notarás de diferente es que cambiamos el tipo de dato de driver, ahora es de tipo Account y como ves está solicitando los dos datos obligatorios para instanciar un objeto de este tipo.