package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args)
    {

        HashSet testSet = createSet();
        System.out.println(testSet.size());
        testSet = removeAllNumbersMoreThan10(createSet());
        System.out.println(testSet.size());

    }

    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> intSet = new HashSet<Integer>();
        intSet.add(1);
        intSet.add(21);
        intSet.add(13);
        intSet.add(51);
        intSet.add(31);
        intSet.add(14);
        intSet.add(15);
        intSet.add(17);
        intSet.add(5);
        intSet.add(54);
        intSet.add(6);
        intSet.add(76);
        intSet.add(34);
        intSet.add(4);
        intSet.add(65);
        intSet.add(23);
        intSet.add(45);
        intSet.add(11);
        intSet.add(81);
        intSet.add(79);

        return intSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        HashSet<Integer> tempSet = new HashSet<Integer>();
        for (int number : set) {
            if (number < 10) {
                tempSet.add(number);
            }
        }
        return tempSet;
    }
}
