package org.example.sample;

/* Разработать приложение с лекции все-таки придется.

        Создать проект из трёх классов (основной с точкой входа и два класса в другом пакете),
        которые вместе должны составлять одну программу, позволяющую
        производить четыре основных математических действия и осуществлять форматированный
        вывод результатов пользователю (ИЛИ ЛЮБОЕ ДРУГОЕ ПРИЛОЖЕНИЕ НА ВАШ ВЫБОР, которое просто демонстрирует работу
        некоторого механизма).

        Пример моего приложения я прикрепил к материалам урока.

        Необходимо установить Docker Desktop.
        Создать Dockerfile, позволяющий откопировать исходный код вашего приложения в образ для демонстрации работы
        вашего приложения при создании соответствующего контейнера.

        Подобную процедуру мы с вами проделали на уроке, теперь необходимо проделать данную процедуру самостоятельно.
*/

import ht1.regular.Decorator;
import ht1.regular.Mathematics;

import javax.print.attribute.standard.MediaSize;

public class Main {
    public static void main(String[] args) {
        int res = Mathematics.addition(2,2);
        System.out.println(Decorator.decorate(res));
        res = Mathematics.subtraction(2,2);
        System.out.println(Decorator.decorate(res));
        res = Mathematics.multiplication(2,2);
        System.out.println(Decorator.decorate(res));
        res = Mathematics.division(2,2);
        System.out.println(Decorator.decorate(res));
    }
}