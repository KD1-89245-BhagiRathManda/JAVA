package assignments.assignment09.q1;

import java.util.*;

enum Operation{
    EXIT,
    ADD{
        @Override
        public String toString() {
            return "Add the student in the collection";
        }
    },
    DISPLAY{
        @Override
        public String toString() {
            return "Display all the students";
        }
    },
    SEARCH{
        @Override
        public String toString() {
            return "Search the student on rollNo";
        }
    },
    SORTROLLNO{
        @Override
        public String toString() {
            return "Sort the student on rollNo";
        }
    },
    SORTNAME{
        @Override
        public String toString() {
            return "Sort the student on name";
        }
    },
    SORTMARKS{
        @Override
        public String toString() {
            return "Sort the student on marks";
        }
    }
}

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double marks;

    public Student() {
    }

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void acceptStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter student marks: ");
        this.marks = scanner.nextDouble();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student student)) return false;
        Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format("%-15d %-15s %-15.0f", id, name, marks);
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }
}

public class Program {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static Operation menuList(){
        Operation[] arrVal = Operation.values();
        for(Operation arr : arrVal){
            System.out.println(arr.ordinal()+". "+arr);
        }
        System.out.println();
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return arrVal[choice];
    }
    public static void addEmployeeToStudentList(List<Student> studentList){
        Student student = new Student();
        student.acceptStudent();
        if(!studentList.contains(student)){
            studentList.add(student);
        }
//        studentList.add(student);
    }
    public static void acceptStudent(int[] studentId){
        System.out.println("Enter Student rollNo: ");
        studentId[0] = sc.nextInt();
    }

    public static void displayStudentList(List<Student> studentList){
        studentList.listIterator().forEachRemaining(student -> System.out.println(student));
    }

    public static Student findStudents(int studentId){
        Student s = new Student();
        s.setId(studentId);
        int index = studentList.indexOf(s);
        if(index != -1){
            return studentList.get(index);
        }
        return null;
    }

    public static void SortStudents(List<Student> studentList, Comparator<Student> comparator){
        studentList.sort(comparator);
        for(Student student : studentList){
            System.out.println(student);
        }
    }
    public static void printStudent(Student s){
        if(s != null){
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        int[] rollNo = new int[1];
        Operation choice;

        while((choice = menuList()) != Operation.EXIT){
            switch (choice) {
                case ADD:
                    addEmployeeToStudentList(studentList);
                    break;
                case DISPLAY:
                    displayStudentList(studentList);
                    break;
                case SEARCH:
                    acceptStudent(rollNo);
                    printStudent(findStudents(rollNo[0]));
                    break;
                case SORTROLLNO:
                    SortStudents(studentList, (x,y) -> x.getId() - y.getId());
                    break;
                case SORTNAME:
                    SortStudents(studentList, (x,y) -> x.getName().compareTo(y.getName()));
                    break;
                case SORTMARKS:
                    SortStudents(studentList, (x,y) -> (int) (x.getMarks() - y.getMarks()));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
