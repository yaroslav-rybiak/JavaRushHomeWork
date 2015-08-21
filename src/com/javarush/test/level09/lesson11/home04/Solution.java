package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String dateString = in.readLine();
        SimpleDateFormat format1 = new SimpleDateFormat("M/dd/yyyy");
        Date date1 = format1.parse(dateString);
        SimpleDateFormat format2 = new SimpleDateFormat("MMM dd, yyyy");
        String date2 = format2.format(date1);

        System.out.println(date2.toUpperCase());
    }
}
