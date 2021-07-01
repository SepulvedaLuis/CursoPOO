class Account:
    id         = int
    name       = str
    document   = str
    email      = str
    password   = str
    
# Creamos nuestra clase en la cual definimos datos tipo int y str(string)

    def __init__(self, name, document):
        self.name       = name
        self.document   = document 

#creamos nuestro método constructor