package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> dataBase = createMap();
        removeAllSummerPeople(dataBase);
        for (Map.Entry<String, Date> pair : dataBase.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JULY 1 1980"));
        map.put("Stallone2", new Date("AUGUST 1 1980"));
        map.put("Stallone3", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone4", new Date("OCTOBER 1 1980"));
        map.put("Stallone5", new Date("NOVEMBER 1 1980"));
        map.put("Stallone6", new Date("DECEMBER 1 1980"));
        map.put("Stallone7", new Date("JANUARY 1 1980"));
        map.put("Stallone8", new Date("FEBRUARY 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        HashMap<String, Date> temp = new HashMap<String, Date>();

        for (Map.Entry<String, Date> pair : map.entrySet()) {
            if (!pair.getValue().toString().contains("Jun") && !pair.getValue().toString().contains("Jul") && !pair.getValue().toString().contains("Aug")) {
                temp.put(pair.getKey(), pair.getValue());
            }
        }

        map.clear();
        map.putAll(temp);
    }
}
