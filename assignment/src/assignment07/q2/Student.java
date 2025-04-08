package assignment07.q2;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student() {
    }

    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int compareTo(Student other) {
        return this.roll - other.roll;
    }
    @Override
    public String toString() {
        return String.format("Rollno : %d, Name : %s, City : %s, Marks : %f",this.roll,this.name,this.city,this.marks);
    }
}
class CustomComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        int diff = s2.getCity().compareTo(s1.getCity());
        if(diff == 0) {
            diff = (int)(s2.getMarks() - s1.getMarks());
        }
        if(diff == 0) {
            diff = s2.getRoll() - s1.getRoll();
        }
        if(diff == 0) {
            diff = s1.getName().compareTo(s2.getName());
        }
        return diff;
    }


}
class Program {

    public static Student[] getInstance(){
        Student[] arr = new Student[6];
        arr[0] = new Student(2, "Raj", "Mumbai", 70.5);
        arr[1] = new Student(5, "Krishna", "Mumbai", 70.5);
        arr[2] = new Student(1, "Gautam", "Gujrat", 80.5);
        arr[3] = new Student(3, "Samiksha", "Chiplun", 92.9);
        arr[4] = new Student(4, "Samarth", "Mumbai", 88.2);
        arr[5] = new Student(5, "Guddu", "Mumbai", 70.5);

        return arr;
    }

    public static void print(Student[] arr, Comparator<Student> comparator){
        Arrays.sort(arr, comparator);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        Student[] arr = Program.getInstance();
        Program.print(arr, new CustomComparator());
    }
}
