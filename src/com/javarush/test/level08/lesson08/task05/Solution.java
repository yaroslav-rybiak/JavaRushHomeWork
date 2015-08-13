package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> dataBase = createMap();
        removeTheFirstNameDuplicates(dataBase);
        for (Map.Entry<String, String> pair : dataBase.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> dataBase = new HashMap<String, String>();
        dataBase.put("SecondName01", "FirstName01");
        dataBase.put("SecondName02", "FirstName02");
        dataBase.put("SecondName03", "FirstName02");
        dataBase.put("SecondName04", "FirstName03");
        dataBase.put("SecondName05", "FirstName03");
        dataBase.put("SecondName06", "FirstName04");
        dataBase.put("SecondName07", "FirstName04");
        dataBase.put("SecondName08", "FirstName05");
        dataBase.put("SecondName09", "FirstName06");
        dataBase.put("SecondName10", "FirstName07");

        return dataBase;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            copy2.remove(pair.getKey());
            if (copy2.containsValue(pair.getValue())) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
