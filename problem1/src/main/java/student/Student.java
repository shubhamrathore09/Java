package student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;
    private String email;
    private int cgpa;

    public Student(int id, String name, String email, int cgpa) {
        this.id = id;
        this.address = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public Student(String name, String email, int cgpa) {
        this.address = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + address + '\'' +
                ", email='" + email + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
