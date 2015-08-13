package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //напишите тут ваш код
        Map<String, String> dataBase = new HashMap<String, String>();
        dataBase.put("secondName01", "firstName01");
        dataBase.put("secondName01", "firstName02");
        dataBase.put("secondName02", "firstName02");
        dataBase.put("secondName03", "firstName02");
        dataBase.put("secondName04", "firstName02");
        dataBase.put("secondName05", "firstName03");
        dataBase.put("secondName06", "firstName04");
        dataBase.put("secondName07", "firstName05");
        dataBase.put("secondName07", "firstName06");
        dataBase.put("secondName07", "firstName07");

        return dataBase;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
