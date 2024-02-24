class Ninja:
    # implement __init__( first_name , last_name , treats , pet_food , pet )
    def __init__(self, first_name, last_name , treats, pet_food, pet):
        self.first_name = first_name
        self.last_name = last_name
        self.treats = treats
        self.pet_food = pet_food
        self.pet = pet

    # implement the following methods:
    # walk() - walks the ninja's pet invoking the pet play() method
    def walk(self):
        self.pet.play()
        return self

    # feed() - feeds the ninja's pet invoking the pet eat() method
    def feeds(self):
        food = self.pet_food.pop()
        print(f"Feeds {food}")
        self.pet.eat()
        return self
    # bathe() - cleans the ninja's pet invoking the pet noise() method
    def bathe(self):
        self.pet.noise()
        return self
    
class Pet:

    # implement __init__( name , type , tricks ):
    def __init__(self, name , type, tricks, noise):
        self.name = name
        self.type = type
        self.tricks = tricks
        self.health = 200
        self.energy = 100
        self.noise = noise

    # implement the following methods:
    # sleep() - increases the pets energy by 25
    def sleep(self):
        self.energy += 25
        return self

    # eat() - increases the pet's energy by 5 & health by 10
    def eat(self):
        self.energy += 5
        self.health += 10
        return self
    
    def play(self):
        self.health+=5
        return self
    
    def sound(self):
        print (f"this is the pet noise {self.noise}")
        return self
    
ins_food = ['Pizza','Burger']
ins_treats = ['Snausage','Bacon',"Trash Bag"]
sie=pet("joe","doe",)
ninja1=ninja("kit","kat",ins_treats,ins_food,sie)
sie = Pet("sie","hoy","anything","tik tak")

ninja1.feed();
ninja1.feed();
ninja1.feed();