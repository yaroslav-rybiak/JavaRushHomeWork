package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        HashMap<String, String> strHash = new HashMap<String, String>();
        strHash.put("арбуз", "ягода");
        strHash.put("банан", "трава");
        strHash.put("вишня", "ягода");
        strHash.put("груша", "фрукт");
        strHash.put("дыня", "овощ");
        strHash.put("ежевика", "куст");
        strHash.put("жень-шень", "корень");
        strHash.put("земляника", "ягода");
        strHash.put("ирис", "цветок");
        strHash.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : strHash.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
