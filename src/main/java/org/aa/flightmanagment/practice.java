//package org.aa.flightmanagment;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//
//
//public class practice {
//    public static void main(String[] args) {
//
//        List<Employee> employees = Arrays.asList(
//                new Employee("Aman", 25, 3000),
//                new Employee("Bala", 30, 4000),
//                new Employee("Charlie", 28, 3500),
//                new Employee("Diana", 35, 5000),
//                new Employee("Eva", 22, 2500),
//                new Employee("Frank", 30, 4000),
//                new Employee("Grace", 25, 3000)
//        );
//
//        System.out.println("printing employees: with salary greater than 3000");
//
//
//        List<Employee> employeeSalaryAbove300 = employees.stream()
//                .filter(emp->emp.getSalary() > 3000)
//                .collect(Collectors.toList());
//
//        employeeSalaryAbove300.forEach(emp -> System.out.println(emp));
//
//        System.out.println("__________________________________");
//
//        System.out.println("I i need to sort the employees in ascending order");
//
//         employees.stream().sorted(Comparator.comparing(Employee::getAge))
//                 .forEach(emp -> System.out.println(emp));
//
//        System.out.println("__________________________________");
//// 3. Map: Convert employee names to uppercase
//
//       List<Employee> emplyeesWithUpperCase = employees.stream()
//               .map(e->new Employee(e.getName().toUpperCase(),e.getAge(),e.getSalary()))
//               .collect(Collectors.toList());
//       emplyeesWithUpperCase.forEach(emp -> System.out.println(emp));
//
//       // print the string
//        employees.stream()
//                .map(e->e.getName().toUpperCase())
//                .forEach(emp -> System.out.println(emp));
//
//
//        // 4. Reduce: Calculate the total salary of all employees
//        int totalSalary = employees.stream()
//                .mapToInt(e -> e.getSalary())
//                .sum();
//        System.out.println("Total salary: " + totalSalary);
//
//        Optional totalSalary2 = employees.stream()
//                .map(e->e.getSalary())
//                .reduce((a,b)->a+b);
//System.out.println("Total salary2: " + totalSalary2.orElse(0));
//
//
//        // 5. Grouping: Group employees by age
//
//        System.out.println("\nEmployees grouped by age:");
//        Map<Integer,List<Employee>> groupByAge = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getAge));
//        groupByAge.forEach((age, emps) -> {
//            System.out.println(age+"" +emps);
//        });
//
//
//        // 6. Partitioning: Divide employees into two groups based on salary > 3000
//        System.out.println("\nEmployees partitioned by salary > 3000:");
//        Map<Boolean, List<Employee>> partitioned = employees.stream()
//                .collect(Collectors.partitioningBy(e -> e.getSalary() > 3000));
//        partitioned.forEach((key, empList) ->
//                System.out.println((key+"------->"+empList)+"\n"
//        ));
//
//        // 7. Max: Find the employee with the maximum salary
//
//        Employee maxSalaryEmployee = employees.stream()
//                .max(Comparator.comparingInt(Employee::getSalary))
//                .orElse(null);
//        System.out.println(maxSalaryEmployee);
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//}
//class Employee {
//    private String name;
//    private int age;
//    private int salary;
//
//    public Employee(String name, int age, int salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }
//}
