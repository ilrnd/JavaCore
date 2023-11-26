package org.example;

abstract class Employee implements Comparable<Employee>{
    protected String name;
    protected String surname;
    protected int birthYear;
    protected double salary;

    public Employee(String name, String surname, int birthYear, double salary) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0){
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }

}
