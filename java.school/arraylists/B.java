package arraylists;

import java.util.ArrayList;

public class B {

    public static void main(String[] args) {

        ArrayList<Student>cs101 = new ArrayList<Student>();

        Student student1 = new Student(3.5, "Ken", 9);
        Student student2 = new Student(3.9, "Barbie", 11);

        cs101.add(student1);
        cs101.add(student2);

        System.out.println(cs101.size());

        Student tempStudent = cs101.get(1);

        System.out.println(tempStudent.getGrade() +  tempStudent.getName());

        // using loops

        for(Student x : cs101){
            System.out.println("Name: " + x.getName());
            System.out.println("Gpa: " + x.getGpa());
            System.out.println("Grade: " + x.getGrade());
        }

        int idx = 0;

        while(idx < cs101.size()){
            Student x = cs101.get(idx);
            System.out.println("Name: " + x.getName());
            System.out.println("Gpa: " + x.getGpa());
            System.out.println("Grade: " + x.getGrade());
            idx ++;
        }

        

    }
    
}

class Student {

    private double gpa;
    private String name;
    private int grade;

    Student(double gpa, String name, int grade){
        this.gpa = gpa;
        this.name = name;
        this.grade = grade;
    }

    double getGpa(){
        return gpa;
    }

    String getName(){
        return name;
    }

    int getGrade(){
        return grade;
    }

    void setGpa(double x){
        gpa = x;
    }

    void setName(String x){
        name = x;
    }

    void setGrade(int x){
        grade = x;
    }
}