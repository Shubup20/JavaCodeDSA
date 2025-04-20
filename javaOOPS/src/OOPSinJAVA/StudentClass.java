package OOPSinJAVA;

import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
        System.out.println(Student.getNumberOfStudent());
        Student s1 = new Student("Shubham", 76, 85.6);//declaration
        System.out.println(s1.percentage);
        System.out.println(s1.rno);
        System.out.println(s1.name);
        Student s2 = new Student("janu", 85, 95);
        System.out.println(s2.percentage);
        System.out.println(s2.rno);
        System.out.println(s2.name);
        //  s1.schoolName = "sbjskjs";//cannot assign a value to final variable schoolName
        System.out.println(s1.schoolName);
        System.out.println(s1.getNumberOfStudent());
//        s1.name = "Shubham";
//        s1.rno = 54;
//        s1.percentage = 95.4;
//        System.out.println(s1.name);
//        System.out.println("default value: " + s1.name + " " + s1.rno + " " + s1.percentage);

//        s1.name = "shubham";
//        s1.percentage = 54;
//        s1.rno = 45;
//        System.out.println(s1.getRno());
//       System.out.println(s1.getRno() );
    }
}
