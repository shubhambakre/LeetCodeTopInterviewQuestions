package Java_Practice_Course;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n 2- Sophomore\n3 - Junior\n4 - Senior");
        this.gradeYear = in.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    //Generate an ID
    private void setStudentID() {
        //grade level+static_id
        id++;
        studentID = gradeYear + "" + id;
    }

    //enroll public
    public void enroll() {

        do {
            System.out.print("Enter course to enroll or q to quit\n");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("q")) {
                courses += "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else {
                break;
            }
            } while (true) ;
            System.out.println("ENROLLED IN: " + courses);
            System.out.println("TUTION BALANCE: " + tutionBalance);
    }
    //view balance



}

