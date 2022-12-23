package Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Operation {



    public Student insert(Student student) throws StudentException{
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("student");
        EntityManager em=emf.createEntityManager();
        Student student1=em.find(Student.class,student.getRoll());
        if(student1==null) {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            em.close();
            return student;
        }
        else{
            throw new StudentException("student already present by that id :"+ student1.getRoll());
        }
    }
    public Student findById(int id) throws StudentException {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("student");
        EntityManager em=emf.createEntityManager();
        Student student=em.find(Student.class,id);
        if(student==null){
            throw new StudentException("student not found by that id");
        }
        else
            return student;
    }
    public String DeleteById(int id) throws  StudentException{
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("student");
        EntityManager em=emf.createEntityManager();
        Student student=em.find(Student.class,id);
        if(student==null){
            throw  new StudentException("student not found by id");
        }
        else{
            em.getTransaction().begin();
            String name=student.getName();
            em.remove(student);
            em.getTransaction().commit();
            em.close();
            return name+" has been deleted from database";
        }
    }
    public Student UpdateMarksById(int id,int marks) throws StudentException {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("student");
        EntityManager em=emf.createEntityManager();
        Student student=em.find(Student.class,id);
        if(student==null){
            throw new StudentException("student not found by id :"+id);
        }
        else{
            em.getTransaction().begin();
            student.setMarks(student.getMarks()+marks);
            em.getTransaction().commit();
            em.close();
            return student;
        }
    }
    public void Inputtaking()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 1 to perform some operation and 0 to exist");
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println("press 1 to insert new student");
            System.out.println("press 2 to view student details by student id");
            System.out.println("press 3 to delete student by student id");
            System.out.println("press 4 to update student marks by student id");
            int task=sc.nextInt();

            switch (task){
                case 1:
                    System.out.println("please enter roll of student");
                    int roll=sc.nextInt();
                    System.out.println("please enter name of student");
                    String name=sc.next();
                    System.out.println("please enter marks of student");
                    int marks=sc.nextInt();
                    Student student=new Student(roll,name,marks);
                    try {
                        System.out.println(insert(student));
                    } catch (StudentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("please enter student id ");
                    int id=sc.nextInt();
                    try {
                        System.out.println(findById(id));
                    } catch (StudentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Please enter student roll number you want to delete ");
                    int Roll=sc.nextInt();
                    try {
                        System.out.println(DeleteById(Roll));
                    } catch (StudentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Please enter student roll whose marks want to update ");
                    int r=sc.nextInt();
                    System.out.println("Please enter marks if increasing so enter marks only if decreasing so use minus sing");
                    int m=sc.nextInt();
                    try {
                        System.out.println(UpdateMarksById(r,m));
                    } catch (StudentException e) {
                        System.out.println(e.getMessage());
                    }
            }

            System.out.println("do you want to perform more operation then press 1 otherwise 0 to exist");
            n= sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Operation opt=new Operation();
        opt.Inputtaking();
    }
}
