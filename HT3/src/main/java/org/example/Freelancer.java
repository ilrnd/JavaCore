package org.example;

public class Freelancer extends Employee {
    public Freelancer(String name, String surname, int birthYear, double salary) {
        super(name, surname, birthYear, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 20.8 * 8;
    }

    @Override
    public String toString(){
        return String.format("%s %s; Фрилансер; Год рождения: %d; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, birthYear, calculateSalary());
    }


}
