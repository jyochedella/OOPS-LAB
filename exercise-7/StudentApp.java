package details;
public class Student {
 private int studentId;
 private String name;
 private double marks1, marks2, marks3;
 public Student(int studentId, String name, double marks1, double 
marks2, double marks3) {
 this.studentId = studentId;
 this.name = name;
 this.marks1 = marks1;
70 | P a g e
 this.marks2 = marks2;
 this.marks3 = marks3;
 }
 public int getStudentId() { return studentId; }
 public String getName() { return name; }
 public double getMarks1() { return marks1; }
 public double getMarks2() { return marks2; }
 public double getMarks3() { return marks3; }
}
package details;
public class MarksCalculator {
 public static double calculateTotal(Student stu) {
 return stu.getMarks1() + stu.getMarks2() + stu.getMarks3();
 }
 public static char calculateGrade(double total) {
 double avg = total / 3;
 if (avg >= 90) return 'A';
 else if (avg >= 75) return 'B';
 else if (avg >= 50) return 'C';
else return 'F';
 }
}
package details;
71 | P a g e
public class Display {
 public static void showStudentDetails(Student stu) {
 double total = MarksCalculator.calculateTotal(stu);
 char grade = MarksCalculator.calculateGrade(total);
 System.out.println("\n----------------------");
 System.out.println("STUDENT REPORT CARD");
 System.out.println("----------------------");
 System.out.println("Student ID : " + stu.getStudentId());
 System.out.println("Student Name: " + stu.getName());
 System.out.println("Total Marks : " + total);
 System.out.println("Grade : " + grade);
 System.out.println("----------------------\n");
 }
}
import details.Student;
import details.MarksCalculator;
import details.Display;
import java.util.Scanner;
public class StudentApp {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Taking Student Details
72 | P a g e
 System.out.print("Enter Student ID: ");
 int studentId = scanner.nextInt();
 scanner.nextLine();
 System.out.print("Enter Student Name: ");
 String name = scanner.nextLine();
 System.out.print("Enter Marks in Subject 1: ");
 double marks1 = scanner.nextDouble();
 System.out.print("Enter Marks in Subject 2: ");
 double marks2 = scanner.nextDouble();
 System.out.print("Enter Marks in Subject 3: ");
 double marks3 = scanner.nextDouble();

 Student stu = new Student(studentId, name, marks1, marks2, marks3);
 
 Display.showStudentDetails(stu);
 scanner.close();
 }
}
