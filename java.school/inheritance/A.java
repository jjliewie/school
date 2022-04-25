package inheritance;

import java.util.ArrayList;

public class A {

    public static void main(String[] args) {

        ArrayList<String> myCourses = new ArrayList<>();
        myCourses.add("Computer Science");
        myCourses.add("Mathematics");
        myCourses.add("Literature");
        myCourses.add("Chinese");
        myCourses.add("Economics");
        myCourses.add("Physics");

        Student student = new Student("Julie Rhee", "Korean", 16, 3.7, 11, myCourses);

        Person person = new Person("Julie Rhee", 16, "Korean");

        person.printIntroduction();
        student.printIntroduction();

    }
    
}

class Person{

    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    String getName(){
        return name;
    }

    void setName(String x){
        name = x;
    }

    int getAge(){
        return age;
    }

    void setAge(int x){
        age = x;
    }

    String getNationality(){
        return nationality;
    }

    void setNationality(String x){
        nationality = x;
    }

    void printIntroduction(){
        System.out.println("Hi! My name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person{
    private double gpa;
    private int grade;
    private ArrayList<String> courses;

    Student(String name, String nationality, int age, double gpa, int grade, ArrayList<String> courses){
        super(name, age, nationality);
        this.grade = grade;
        this.gpa = gpa;
        this.courses = courses;
    }

    double getGpa(){
        return gpa;
    }

    void setGpa(double x){
        gpa = x;
    }

    int getGrade(){
        return grade;
    }

    void setGrade(int x){
        grade = x;
    }

    ArrayList<String> getCourses(){
        return courses;
    }

    void setCourses(ArrayList<String> x){
        courses = x;
    }

    void printCourses(){
        for(String i: courses){
            System.out.println(i);
        }
    }

    @Override void printIntroduction(){
        System.out.println("Hi! My name is " + super.getName() + " and I am in " + grade + "th grade. My gpa is currently a " + gpa + ".");
    }
}