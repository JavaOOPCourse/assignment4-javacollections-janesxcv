package model;

public class Student{
    private int id;
    private String name;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return "name :"+getName() | "id :" +getId()| "gpa :" +getGpa()|
    }
}

}
