package lk.ijse.spring.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emp_ID;
    private String emp_Name;
    private String emp_Address;
    private String emp_NIC;
    private String emp_Contact;
    private BigDecimal emp_Salary;

    public Employee() {
    }

    public Employee(String emp_Name, String emp_Address, String emp_NIC, String emp_Contact, BigDecimal emp_Salary) {
        this.setEmp_Name(emp_Name);
        this.setEmp_Address(emp_Address);
        this.setEmp_NIC(emp_NIC);
        this.setEmp_Contact(emp_Contact);
        this.setEmp_Salary(emp_Salary);
    }


    public int getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public String getEmp_Address() {
        return emp_Address;
    }

    public void setEmp_Address(String emp_Address) {
        this.emp_Address = emp_Address;
    }

    public String getEmp_NIC() {
        return emp_NIC;
    }

    public void setEmp_NIC(String emp_NIC) {
        this.emp_NIC = emp_NIC;
    }

    public String getEmp_Contact() {
        return emp_Contact;
    }

    public void setEmp_Contact(String emp_Contact) {
        this.emp_Contact = emp_Contact;
    }

    public BigDecimal getEmp_Salary() {
        return emp_Salary;
    }

    public void setEmp_Salary(BigDecimal emp_Salary) {
        this.emp_Salary = emp_Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_ID=" + emp_ID +
                ", emp_Name='" + emp_Name + '\'' +
                ", emp_Address='" + emp_Address + '\'' +
                ", emp_NIC='" + emp_NIC + '\'' +
                ", emp_Contact='" + emp_Contact + '\'' +
                ", emp_Salary=" + emp_Salary +
                '}';
    }
}
