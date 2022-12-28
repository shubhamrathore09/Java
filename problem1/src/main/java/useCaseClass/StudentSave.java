package useCaseClass;

import dao.StudentDao;
import dao.StudentDaoImp;
import student.Student;

import java.util.Scanner;

public class StudentSave {
    public static void InputByScanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter cgpa");
        int cgpa= sc.nextInt();

        System.out.println("please enter address");
       String add=sc.next();
        System.out.println("Please enter email");
        String email=sc.next();

        StudentDao dao =new StudentDaoImp();
        System.out.println(dao.saveStudent(new Student(add,email,cgpa)));
        //taking input by scanner from user
    }

    public static void main(String[] args) {
        StudentDao dao=new StudentDaoImp();
        System.out.println(dao.saveStudent(new Student("bhopal","shubham@123",9)));
//        InputByScanner();
    }
}
