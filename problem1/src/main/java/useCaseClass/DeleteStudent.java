package useCaseClass;

import dao.StudentDao;
import dao.StudentDaoImp;

import java.util.Scanner;

public class DeleteStudent {
    public static void InputByScanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter id");
        int id= sc.nextInt();
        StudentDao dao =new StudentDaoImp();
        System.out.println(dao.deleteStudentById(id));
        //taking input by scanner from user
    }
    public static void main(String[] args) {
        StudentDao dao =new StudentDaoImp();
        System.out.println(dao.deleteStudentById(1));
//        InputByScanner();
    }
}
