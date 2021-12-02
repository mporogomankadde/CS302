package myutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetTestClass {
    public static void main(String[] args) {
        Pet p1= new Pet("aun",'d',5,new Appliances(12525));
       p1.addAppliances(new Appliances(12585));
//        Pet p2= new Pet("lucy",'c',7);
//        Pet p3= new Pet("buton",'d',10);
//        Pet[] arr={p1,p2,p3};
//        List<Pet> al= new ArrayList<>(List.of(arr));
//        al.add(new Pet ("cowe",'c',8));
//
//        al.sort((o1,o2)->(o1.getName().compareTo(o2.getName())));
//        System.out.println(al);
//        al.sort(((o1,o2)->(o1.getName().compareTo(o2.getName()))*-1));
//        System.out.println(al);

       // al.forEach((n)->{System.out.println(n);});

    }
}
