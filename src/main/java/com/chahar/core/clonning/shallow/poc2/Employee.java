package com.chahar.core.clonning.shallow.poc2;

public class Employee implements Cloneable
{
    private int empoyeeId;
    private String employeeName;
    private Department department;

    public Employee(int id, String name, Department dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }

    @Override
    public Employee clone() {
        //INFO: SHALLOW CLONING : Default JAVA Implementation.

        try
        {
            return (Employee) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public int getEmpoyeeId() {
        return empoyeeId;
    }

    public void setEmpoyeeId(int empoyeeId) {
        this.empoyeeId = empoyeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
