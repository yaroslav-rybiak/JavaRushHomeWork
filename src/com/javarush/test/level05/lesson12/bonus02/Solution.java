package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e)
    {
        int[] numbers = new int[5];
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
        numbers[3] = d;
        numbers[4] = e;
        Arrays.sort(numbers);
        return numbers[0];
    }

}
