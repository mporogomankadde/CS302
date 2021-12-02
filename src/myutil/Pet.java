package myutil;

import java.util.ArrayList;
import java.util.List;

public class Pet implements Comparable<Pet> {
    private String name;
    private char type;
    private int age;
    private ArrayList<Appliances> appliances=new ArrayList<Appliances>();

    public Pet(String name, char type,int age,Appliances appliances) {
        this.name = name;
        this.type = type;
        this.age=age;
        this.appliances.add(appliances);
    }

    public void addAppliances(Appliances appliances) {
        this.appliances.add(appliances);
    }

    public String getName() {
        return name;
    }
    public int  getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "name:" + name  +
                " type:" + type  +
                        " Age:" + age ;
    }


    @Override
    public int compareTo(Pet o) {
        return getName().compareTo(o.getName());
    }
}
