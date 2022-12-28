package dao;

import student.Student;

public interface StudentDao {
   public Student findStudentById(int id);
    public String saveStudent(Student student);
   public String deleteStudentById(int id);
   public String updateStudentCGPA(int id, int cgpa);

}
