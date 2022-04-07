package btcogiao;

import javax.naming.Name;
import java.util.Date;

public class Student {
    private int rollNo;
    private String Name;
    private Date Dob;
    private String ClassCurrent;
    private String status;

    public Student(int RollNo, String Name, Date Dob, String ClassCurrent, String status) {
        this.ClassCurrent = ClassCurrent;
        this.Dob = Dob;
        this.Name = Name;
        this.rollNo = rollNo;
        this.status = status;


    }

    public Date getDob() {
        return Dob;
    }

    public String getName() {
        return Name;
    }

    public String getClassCurrent() {
        return ClassCurrent;
    }

    public String getStatus() {
        return status;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;

    }
    public int getRollNo(){
        return rollNo;
    }
    public String toString(){return "'" +Name+ " & "+ rollNo+ " & "+Dob+" & "+ClassCurrent+ "&"+ status;}
}
