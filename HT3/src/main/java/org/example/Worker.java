package org.example;

public class Worker extends Employee{
    public Worker(String name, String surname, int birthYear, double salary) {
        super(name, surname, birthYear, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%s %s; Рабочий; Год рождения: %d; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, birthYear, calculateSalary());
    }
}
