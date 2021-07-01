from car import Car #Importamos la clase que vamos a usar
from account import Account

if __name__ == "__main__":
    car = Car("AMS234", Account("Andres Díaz", "AND789"))
    print(vars(car))
    print(vars(car.driver))
    

#Primer ejemplo de clase y enviar un mensaje
# car = Car() #Generamos nuestro primer objeto con la clase Car
#     car.license = "AMS234"
#     car.driver = "Andres Herrera" #Creamos los atributos de nuestra clase
#     car.passegender = 3
#     print(vars(car))  #Imprimimos los valores de nuestro objeto, se imprimi en formato .Json

#     car2 =  Car()  #Creamos un nuevo objeto
#     car2.license = "QTY786"
#     car2.driver = "Marta Diaz"
#     car2.passegender = 4
#     print(vars(car2))