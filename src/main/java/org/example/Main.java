package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Bars = new ArrayList<>();
        Bars.add("run");
        Cat cat1 = new Cat("Барсик", new Date(123, 11,15), Bars);
        Dog dog1 = new Dog("Рекс");
        System.out.println(cat1.getName());
        System.out.println(cat1.getDayOfBirthday());
        System.out.println(dog1.getName());
        System.out.println(cat1.getCommands());
        System.out.println(dog1.getId());
        System.out.println(cat1.getName());
        System.out.println(dog1.getName());
        System.out.println(Pets.getCounter());


        PackAnimals packAnimal1 = new PackAnimals();
        PackAnimals packAnimal2 = new PackAnimals();
        PackAnimals packAnimal3 = new PackAnimals();
        System.out.println(packAnimal1.getId());
        System.out.println(packAnimal2.getId());
        System.out.println(packAnimal3.getId());
        System.out.println(packAnimal1.getName());
        System.out.println(packAnimal2.getName());
        System.out.println(packAnimal3.getName());
        System.out.println(PackAnimals.getCounter());
    }
}