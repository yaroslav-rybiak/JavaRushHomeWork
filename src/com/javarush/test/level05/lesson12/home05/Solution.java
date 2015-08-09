package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int sum = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            try {
                String number = in.readLine();
                sum += Integer.parseInt(number);
            }
            catch(Exception e) {
                System.out.println(sum);
                break;
            }
        }
    }
}
