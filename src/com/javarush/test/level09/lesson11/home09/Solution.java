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
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("cat01", new Cat("cat01"));
        map.put("cat02", new Cat("cat02"));
        map.put("cat03", new Cat("cat03"));
        map.put("cat04", new Cat("cat04"));
        map.put("cat05", new Cat("cat05"));
        map.put("cat06", new Cat("cat06"));
        map.put("cat07", new Cat("cat07"));
        map.put("cat08", new Cat("cat08"));
        map.put("cat09", new Cat("cat09"));
        map.put("cat10", new Cat("cat10"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<Cat>();
        for (Map.Entry<String, Cat> entry : map.entrySet())
        {
            catSet.add(entry.getValue());
        }

        return catSet;
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
