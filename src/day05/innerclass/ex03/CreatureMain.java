package day05.innerclass.ex03;

class Creature {

    int life;

    Creature(Animal animal) {
        Animal animal1 = animal;
    }

    public void method1() {

    }
}

class Animal {
    Animal animal = new Animal();
    Creature creature = new Creature(animal);
}

public class CreatureMain {

}
