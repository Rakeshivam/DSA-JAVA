public class Constructors {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rakesh");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int rollNo;

    Student() {
        System.out.println("Constructor is called");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

}