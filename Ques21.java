class Student{
    String name;
    int rollNo;
    int marks;

    Student(String name,int rollNo,int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void getDetails(){
        System.out.println("Student name: "+name+" Student roll number: "+rollNo+" Student marks: "+marks);
        System.out.println(" ");
    }
}


public class Ques21 {
    public static void main(String[] args) {
        Student s1 = new Student("Dhruv",13,100);
        Student s2 = new Student("Abc",23,90);
        Student s3 = new Student("Jai",33,90);

        s1.getDetails();
        s2.getDetails();
        s3.getDetails();
    }
}
