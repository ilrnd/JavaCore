/*
Создать класс, содержащий массив или коллекцию сотрудников (как Worker так и Freelancer),
        и реализовать возможность вывода данных с использованием foreach
        (подсказка: вам потребуется поработать с интерфейсом Iterable).
 */

package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Registry<Type> implements Iterable<Type>{
    private ArrayList<Type> ownList;
    private int currentSize;


    public Registry() {
        ownList = new ArrayList<Type>();
    }


    public void addToRegistry(Type emp){
        ownList.add(emp);
        currentSize++;
    }


    @Override
    public Iterator<Type> iterator() {
        Iterator<Type> it = new Iterator<Type>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && ownList.get(currentIndex) != null;
            }

            @Override
            public Type next() {
                return ownList.get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
