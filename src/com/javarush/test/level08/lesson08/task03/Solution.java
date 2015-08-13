package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> dataBase = createMap();
        System.out.println(dataBase.size());

        System.out.println(getCountTheSameFirstName(dataBase, "Иван"));
        System.out.println(getCountTheSameLastName(dataBase, "Иванов"));
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> dataBase = new HashMap<String, String>();
        dataBase.put("Иванов", "Иван");
        dataBase.put("Иванов2", "Пётр");
        dataBase.put("Сергеев", "Иван");
        dataBase.put("Сергеев1", "Иван1");
        dataBase.put("Сергеев2", "Иван2");
        dataBase.put("Сергеев3", "Иван3");
        dataBase.put("Сергеев4", "Иван4");
        dataBase.put("Сергеев5", "Иван5");
        dataBase.put("Сергеев6", "Иван6");
        dataBase.put("Сергеев7", "Иван7");


        return dataBase;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                i += 1;
            }
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(familiya)) {
                i += 1;
            }
        }
        return i;
    }
}
