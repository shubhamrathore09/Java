package useCaseClass;

import dao.*;

import java.util.Scanner;


public class UpdateByID {

    public static void InputByScanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter id");
        int id= sc.nextInt();
        System.out.println("Please enter cgpa");
        int cgpa= sc.nextInt();
        StudentDao dao =new StudentDaoImp();
        System.out.println(dao.updateStudentCGPA(id,cgpa));
        //taking input by scanner from user
    }

    public static void main(String[] args) {
        StudentDao dao =new StudentDaoImp();
        System.out.println(dao.updateStudentCGPA(1,8));
//        InputByScanner();
    }

}
