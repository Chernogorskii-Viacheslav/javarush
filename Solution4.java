package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Cat cat0 = new Cat("Vaska");
        Cat cat1 = new Cat("Vervr");
        Cat cat2 = new Cat("Vdvvv");
        Cat cat3 = new Cat("Vethf");
        Cat cat4 = new Cat("Verty");
        Cat cat5 = new Cat("Vterf");
        Cat cat6 = new Cat("Vikuy");
        Cat cat7 = new Cat("Vyhte");
        Cat cat8 = new Cat("Volkh");
        Cat cat9 = new Cat("Vputr");

        Map<String, Cat> catMap = new HashMap<String, Cat>();

        catMap.put("Vaska", cat0);
        catMap.put("Vervr", cat1);
        catMap.put("Vdvvv", cat2);
        catMap.put("Vethf", cat3);
        catMap.put("Verty", cat4);
        catMap.put("Vterf", cat5);
        catMap.put("Vikuy", cat6);
        catMap.put("Vyhte", cat7);
        catMap.put("Volkh", cat8);
        catMap.put("Vputr", cat9);

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Cat s = iterator.next().getValue();
            cats.add(s);
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
