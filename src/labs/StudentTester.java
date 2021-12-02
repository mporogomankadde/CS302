package labs;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class StudentTester {
    public static void main(String[] args) {
        Student s1=new Student("Brian",122);
        Student s2=new Student("Dawn",123);
        Student s3=new Student("Brian",124);
        Student[] std={s1,s2,s3};
        Integer[] arr={s1.getIdNumber(),s2.getIdNumber(),s3.getIdNumber()};
        List<Integer> al= new ArrayList<>(List.of(arr));
        Collections.sort(al);
        al.forEach((n)->{System.out.println(n);});
       int b=(s1.getLastName().compareTo(s2.getLastName())) ;
        System.out.println(b);


    }
}
