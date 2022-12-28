package useCaseClass;

import dao.StudentDao;
import dao.StudentDaoImp;

import java.util.Scanner;

public class FIndBYID {
    public static void InputByScanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter id");
        int id= sc.nextInt();
        StudentDao dao =new StudentDaoImp();
        System.out.println(dao.findStudentById(id));
        //taking input by scanner from user
    }
    public static void main(String[] args) {
        StudentDao dao =new StudentDaoImp();
        System.out.println(dao.findStudentById(1));
//        InputByScanner();
    }
}
