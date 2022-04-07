package btcogiao;

import java.util.Date;
import java.util.Set;

public class Teststudent {
    public static void main(String[] args){
        Date d1= new Date(28,9,2003);
        Class hoang= new Class("T2109M", 2109);
        System.out.println(hoang);

        Student mnStudent = new Student(29,"Luong viet hoang",d1,"T2109M","Learning");
        mnStudent.setRollNo(29);
        System.out.println(mnStudent);
        System.out.println("name is: " +mnStudent.getName());
        System.out.println("rollNo: "+mnStudent.getRollNo());
        System.out.println("Dob: "+mnStudent.getDob());
        System.out.println("classCurrent : "+mnStudent.getClassCurrent());
        System.out.println("Status : " +mnStudent.getStatus());

        System.out.println(mnStudent);

    }
}
