package btcogiao;

public class Class {
    private int id;
    private String className;

    public Class(String className, int id){
        this.className= className;
        this.id = id;

    }
    public String getClassName(){return className;}
    public  int getId(){return  id;}
    public String toString(){return  className + "(" + id + ")";}
}
