package com.chahar.core.collections;

import java.util.ArrayList;
import java.util.List;

public class FailFastCheckingApp {

    public static void main(String[] args) {
        new FailFastCheckingApp().test();
    }

    public void test(){
        /*INFO:
        modCount is AbstractList represent number of operation add/remove.
        for remove/add operation it increases count by 1.
        */

        List<Employee1> employes = new ArrayList<>();

        employes.add( new Employee1("1"));
        employes.add( new Employee1("2"));
        employes.add( new Employee1("3"));
        employes.add( new Employee1("4"));
        employes.add( new Employee1("5"));

        employes.remove(2);
        employes.remove(0);
        employes.remove(1);

        System.out.println("program reached at end"+employes);
    }


    private class Employee1 {
        private String name;

        public Employee1(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}


