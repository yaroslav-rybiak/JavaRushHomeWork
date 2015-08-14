package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("DECEMBER 31 2019"));
    }

    public static boolean isDateOdd(String date) throws Exception
    {
        String[] parts = date.split(" ");
        Calendar calendar = Calendar.getInstance();
        int year = Integer.parseInt(parts[2]);
        int month;
        if (parts[0].equals("JANUARY")) month = 0;
        else if (parts[0].equals("FEBRUARY")) month = 1;
        else if (parts[0].equals("MARCH")) month = 2;
        else if (parts[0].equals("APRIL")) month = 3;
        else if (parts[0].equals("MAY")) month = 4;
        else if (parts[0].equals("JUNE")) month = 5;
        else if (parts[0].equals("JULY")) month = 6;
        else if (parts[0].equals("AUGUST")) month = 7;
        else if (parts[0].equals("SEPTEMBER")) month = 8;
        else if (parts[0].equals("OCTOBER")) month = 9;
        else if (parts[0].equals("NOVEMBER")) month = 10;
        else month = 11;
        int day = Integer.parseInt(parts[1]);
        calendar.set(year, month, day);

        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
