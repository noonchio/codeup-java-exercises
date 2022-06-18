package grades;

import java.util.ArrayList;

public class Student {

    private String name;

//    private ArrayList<Integer> grades;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



//    public int[] getGrades() {
////        return grades;
//    }

//    public void setGrades(int grades) {
//        this.grades = new ArrayList<>();
//    }




//    Student(String name){
//        this.name = name;
//        this.grades = new ArrayList<>();
//    }

//    Student(String name, int grades){
//        this();
////        this.grades = new ArrayList<>();
//        this.name = name;
//
//    }

/*
    // returns the student's name
    public String getName() {
        return null;
    }
*/

    // adds the given grade to the grades property
//    public void addGrade(int grade) {
//            grades.add(grade);
//    }

    // returns the average of the students grades
    public double getGradeAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) sum = sum + grade;

        return   sum / grades.length;
    }

}
