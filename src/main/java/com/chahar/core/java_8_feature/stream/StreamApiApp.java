package com.chahar.core.java_8_feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiApp {

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<10;i++){
            numbers.add( new Integer(i*10));
        }

        List<Integer> numbers1 = numbers.stream().filter(i-> i < 50 ).collect(Collectors.toList());
        System.out.println(numbers1);


        List<Employee> employees  = new ArrayList<>();
        for(int i=1 ; i<10; i++){
            employees.add(new Employee((1+i) *5));
        }
        System.out.println("Before employee data: " + employees);
        List<Employee> employees1 = employees.stream().filter(e->e.getId() >= 40 ).collect(Collectors.toList());
        System.out.println("After employee data: " + employees1);

    }

}

class Employee {
    private int id;

    public Employee(int id){this.id=id;}

    public int getId(){return this.id; }

    public String toString(){
        return "Employee: id="+ id;
    }
}
