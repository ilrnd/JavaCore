package org.example;
/*
Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой
(один из потомков - Freelancer) и фиксированной оплатой (второй потомок -Worker).
        а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
        Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
        для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
        б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.
        в) ** Реализовать интерфейсы для возможности сортировки массива/коллекции
        (обратите ваше внимание на интерфейсы Comparator, Comparable),
        добавьте новое состояние на урове базового типа и создайте свой уникальный компаратор.
        г) ** Создать класс, содержащий массив или коллекцию сотрудников (как Worker так и Freelancer),
        и реализовать возможность вывода данных с использованием foreach
        (подсказка: вам потребуется поработать с интерфейсом Iterable).

*/

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        Employee worker1 = new Worker("Иван", "Иванов", 1980, 50000);
        Employee worker2 = new Worker("Петр", "Петров", 1983, 45000);
        Employee freelancer1 = new Freelancer("Сидр", "Сидоров", 1986, 1000);
        Employee freelancer2 = new Freelancer("Александр", "Александров", 1990, 800);

        Freelancer freelancer3 = new Freelancer("Игорь", "Попов", 2000, 900);
        Worker worker3 = new Worker("Василий", "Васильев", 1999, 60000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(worker1);
        employeeList.add(worker2);
        employeeList.add(freelancer1);
        employeeList.add(freelancer2);
        System.out.println("Список сотрудников: ");
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
        System.out.println("\nСписок сотрудников (отсортирован по фамилии и зп): ");
        Collections.sort(employeeList);
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Test work with ITERATOR");
        Registry<Employee> registry = new Registry<Employee>();
        registry.addToRegistry(worker3);
        registry.addToRegistry(freelancer3);
        for(Employee employee: registry){
            System.out.println(employee);
        }

    }
}