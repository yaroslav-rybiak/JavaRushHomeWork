package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String monthString = in.readLine().toLowerCase();
        int monthNumber;
        if (monthString.equals("january")) {
            monthNumber = 1;
        }
        else if (monthString.equals("february")) {
            monthNumber = 2;
        }
        else if (monthString.equals("march")) {
            monthNumber = 3;
        }
        else if (monthString.equals("april")) {
            monthNumber = 4;
        }
        else if (monthString.equals("may")) {
            monthNumber = 5;
        }
        else if (monthString.equals("june")) {
            monthNumber = 6;
        }
        else if (monthString.equals("july")) {
            monthNumber = 7;
        }
        else if (monthString.equals("august")) {
            monthNumber = 8;
        }
        else if (monthString.equals("september")) {
            monthNumber = 9;
        }
        else if (monthString.equals("october")) {
            monthNumber = 10;
        }
        else if (monthString.equals("november")) {
            monthNumber = 11;
        }
        else if (monthString.equals("december")) {
            monthNumber = 12;
        }
        else monthNumber = 13;

        monthString = monthString.substring(0, 1).toUpperCase() + monthString.substring(1);

        System.out.println(monthString + " is " + monthNumber + " month");
    }
}
