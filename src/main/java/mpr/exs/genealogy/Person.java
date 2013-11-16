package mpr.exs.genealogy;

public class Person {
    private String fname;
    private String lname;
    private Sex sex;

    public Person() {}    
    
    public Person(String fname, String lname, Sex sex) {
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
    }

    public Sex getSex() {
        return this.sex;
    }

    public String toString() {
        return this.fname + " " + this.lname + " (" + this.sex + ")";
    }
}
