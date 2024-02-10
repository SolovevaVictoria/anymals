package org.example;

import java.util.ArrayList;
import java.util.Date;

public class PackAnimals extends Animal{
    public static int counter;
    public static int idCounter;
    public int id;
    {
        counter++;
        id = ++idCounter;
    }
    static {
        idCounter = 0;
    }

    protected static int getCounter(){
        return counter;
    }

    public int getId() {
        return id;
    }

    public PackAnimals(){
        super();
    }

    public PackAnimals(String name){
        super(name);
    }

    public PackAnimals (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public PackAnimals(String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
    }
}