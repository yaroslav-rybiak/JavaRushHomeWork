package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human kid01 = new Human();
        kid01.name = "kid01";
        kid01.sex = true;
        kid01.age = 10;
        kid01.children = new ArrayList<Human>();

        Human kid02 = new Human();
        kid02.name = "kid02";
        kid02.sex = true;
        kid02.age = 11;
        kid02.children = new ArrayList<Human>();

        Human kid03 = new Human();
        kid03.name = "kid03";
        kid03.sex = false;
        kid03.age = 12;
        kid03.children = new ArrayList<Human>();

        Human father = new Human();
        father.name = "father";
        father.sex = true;
        father.age = 40;
        father.children = new ArrayList<Human>();
        father.children.add(kid01);
        father.children.add(kid02);
        father.children.add(kid03);

        Human mother = new Human();
        mother.name = "mother";
        mother.sex = false;
        mother.age = 39;
        mother.children = new ArrayList<Human>();
        mother.children.add(kid01);
        mother.children.add(kid02);
        mother.children.add(kid03);

        Human grandpa01 = new Human();
        grandpa01.name = "grandpa01";
        grandpa01.sex = true;
        grandpa01.age = 60;
        grandpa01.children = new ArrayList<Human>();
        grandpa01.children.add(father);

        Human grandma01 = new Human();
        grandma01.name = "grandma01";
        grandma01.sex = false;
        grandma01.age = 59;
        grandma01.children = new ArrayList<Human>();
        grandma01.children.add(father);

        Human grandpa02 = new Human();
        grandpa02.name = "grandpa02";
        grandpa02.sex = true;
        grandpa02.age = 60;
        grandpa02.children = new ArrayList<Human>();
        grandpa02.children.add(mother);

        Human grandma02 = new Human();
        grandma02.name = "grandma02";
        grandma02.sex = false;
        grandma02.age = 59;
        grandma02.children = new ArrayList<Human>();
        grandma02.children.add(mother);

        System.out.println(grandpa01);
        System.out.println(grandpa02);
        System.out.println(grandma01);
        System.out.println(grandma02);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid01);
        System.out.println(kid02);
        System.out.println(kid03);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
