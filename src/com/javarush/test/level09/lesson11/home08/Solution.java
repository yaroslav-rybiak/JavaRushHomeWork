package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
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
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] subList1 = {1, 2, 3, 4, 5};
        int[] subList2 = {1, 2};
        int[] subList3 = {1, 2, 3, 4};
        int[] subList4 = {1, 2, 3, 4, 5, 6, 7};
        int[] subList5 = new int[0];

        list.add(subList1);
        list.add(subList2);
        list.add(subList3);
        list.add(subList4);
        list.add(subList5);

        return list;
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
