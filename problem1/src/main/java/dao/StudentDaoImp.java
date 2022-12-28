package dao;

import emuti.Emu;
import student.Student;

import javax.persistence.EntityManager;

public class StudentDaoImp implements  StudentDao{
    @Override
    public Student findStudentById(int id) {
        EntityManager em= Emu.provideConnection();
        Student student=em.find(Student.class,id);
        return student;
    }

    @Override
    public String saveStudent(Student student) {
        EntityManager em=Emu.provideConnection();
        if(student==null)return "student not valid";
        else {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            em.close();
            return "student sucecssfully saved";
        }
    }

    @Override
    public String deleteStudentById(int id) {
        EntityManager em=Emu.provideConnection();
        Student student=em.find(Student.class,id);
        if(student==null){
            return "student not available by that id";
        }
        else{
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
            em.close();
            return "studnet delete sucessfully";
        }
    }

    @Override
    public String updateStudentCGPA(int id, int cgpa) {
        EntityManager em=Emu.provideConnection();
        Student student=em.find(Student.class,id);
        if(student==null){
            return "student not available by that id "+id;
        }
        else{
            em.getTransaction().begin();
            student.setCgpa(cgpa);
            em.getTransaction().commit();
            em.close();
            return "cgpa succesfully updated";
        }

    }
}
