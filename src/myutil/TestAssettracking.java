package myutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestAssettracking {
    public static void main(String[] args) {
        Appliances ap1=new Appliances(122);
        Appliances ap2=new Appliances(123);
        Appliances ap3=new Appliances(124);

        Electronic e1=new Electronic(211);
        Electronic e2=new Electronic(212);
        Electronic e3=new Electronic(213);

        Automobiles a1=new Automobiles(311);
        Automobiles a2=new Automobiles(312);
        Automobiles a3=new Automobiles(313);

        CompactDisk c1= new CompactDisk(411);
        CompactDisk c2= new CompactDisk(412);
        CompactDisk c3= new CompactDisk(413);

        Assettracking ass=new Assettracking();
        ass.appliances.add(ap1);
        Appliances[] apl= {ap1,ap2,ap3};
        List<Appliances> al= new ArrayList<>(List.of(apl));
        //Collections.binarySearch(al,);

       // System.out.println(ass.appliances.size());

    }
}
