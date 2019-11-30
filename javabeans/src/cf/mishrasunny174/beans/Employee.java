package cf.mishrasunny174.beans;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    public static final long serialVersionUID = 2;
    private String empName;
    private int empid;
    private double salary;
    private Date birthday;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}