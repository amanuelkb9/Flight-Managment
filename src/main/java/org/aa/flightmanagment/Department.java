package org.aa.flightmanagment;

import java.util.*;
import java.util.stream.*;

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

class AdvancedFlatMapExample {
    public static void main(String[] args) {
        Department hr = new Department("HR", Arrays.asList(new Employee("Alice", 30, 5000),
                new Employee("Bob", 30, 6000),


                new Employee("Bob", 25, 4500)));

        Department it = new Department("IT", Arrays.asList(new Employee("Charlie", 35, 6000), new Employee("David", 28, 4800)));

        List<Department> departments = Arrays.asList(hr, it);

        List<Employee> employees = departments.stream().flatMap(department -> department.getEmployees().stream()).toList();


        System.out.println("All Employees:");
        employees.forEach(System.out::println);

    }
}
