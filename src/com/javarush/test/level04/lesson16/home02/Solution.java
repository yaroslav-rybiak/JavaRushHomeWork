package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Arrays;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer numbers[] = new Integer[3];
        numbers[0] = Integer.parseInt(in.readLine());
        numbers[1] = Integer.parseInt(in.readLine());
        numbers[2] = Integer.parseInt(in.readLine());

        Arrays.sort(numbers);
        System.out.println(numbers[1]);
    }
}
