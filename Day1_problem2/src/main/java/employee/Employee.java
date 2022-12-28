package employee;

import javax.persistence.*;

@Entity
@NamedQuery(query = "select e from Employee e where e.empid=:id",name = "findById")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empid;
    private String name;
    private String address;
    private int salary;

    public Employee(int empid, String name, String address, int salary) {
        this.empid = empid;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Employee(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
