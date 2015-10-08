package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
 Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        int[] mas0 = {5, 5, 5, 5, 5};
        int[] mas1 = {2, 2};
        int[] mas2 = {4, 4, 4, 4};
        int[] mas3 = {7, 7, 7, 7, 7, 7, 7};
        int[] mas4 = {};

        ArrayList<int[]> listMas = new ArrayList<int[]>();

        listMas.add(mas0);
        listMas.add(mas1);
        listMas.add(mas2);
        listMas.add(mas3);
        listMas.add(mas4);
        return listMas;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
