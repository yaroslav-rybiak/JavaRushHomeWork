package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add("101");
        strArray.add("102");
        strArray.add("103");
        strArray.add("104");
        strArray.add("105");

        strArray.remove(0);
        strArray.remove(1);
        strArray.remove(2);

        for (int i = 0; i < strArray.size(); i++) {
            System.out.println(strArray.get(i));
        }
        System.out.println(strArray.size());
    }
}
