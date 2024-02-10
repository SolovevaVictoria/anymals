package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Pets extends Animal{
    public static int counter;
    public static int idCounter;
    public int id;
    {
        counter++;
        id = ++idCounter;

    }
    public Pets(){
        super();
    }

    public Pets(String name){
        super(name);
    }

    public Pets (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public Pets(String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
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

}
