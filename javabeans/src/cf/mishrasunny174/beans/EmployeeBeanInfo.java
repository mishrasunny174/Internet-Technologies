package cf.mishrasunny174.beans;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class EmployeeBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        PropertyDescriptor pd[] = new PropertyDescriptor[4];
        try{
            pd[0] = new PropertyDescriptor("empName", Employee.class, "getEmpName", "setEmpName");
            pd[1] = new PropertyDescriptor("empid", Employee.class, "getEmpid", "setEmpid");
            pd[2] = new PropertyDescriptor("salary", Employee.class,"getSalary", "setSalary");
            pd[3] = new PropertyDescriptor("age", Employee.class, "getAge", "setAge");
        } catch (IntrospectionException ise) {
            ise.printStackTrace();
        }
        return pd;
    }
}