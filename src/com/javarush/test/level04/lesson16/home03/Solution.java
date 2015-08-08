package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        int sum = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number = Integer.parseInt(in.readLine());
            if (number != -1)
            {
                sum += number;
            }
            else {
                sum += number;
                System.out.println(sum);
                break;
            }
        }
    }
}
