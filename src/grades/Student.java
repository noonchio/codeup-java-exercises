package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = new ArrayList<>();
    }

    Student(){}

    Student(String name, int grades){
        this.name = name;
        this.grades = new ArrayList<>();
    }

//    // returns the student's name
//    public String getName() {
//        return null;
//    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {

    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return 0;
    }

}
