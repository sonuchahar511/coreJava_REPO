package com.chahar.core.clonning.deep.poc2;

public class DeepCloning2App
{
    public static void main(String[] args)
    {
        Department hr = new Department(1, "Human Resource");

        Employee original = new Employee(1, "Admin", hr);
        Employee cloned = (Employee) original.clone();

        //Let change the department name in cloned object and we will verify in original object
        cloned.getDepartment().setName("Finance");

        System.out.println(original.getDepartment().getName());
        System.out.println(cloned.getDepartment().getName());

    }
}
