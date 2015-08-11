package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandFather1 = new Human();
        grandFather1.name = "grandFather1";
        grandFather1.sex = true;
        grandFather1.age = 60;
        grandFather1.father = null;
        grandFather1.mother = null;

        Human grandFather2 = new Human();
        grandFather2.name = "grandFather2";
        grandFather2.sex = true;
        grandFather2.age = 60;
        grandFather2.father = null;
        grandFather2.mother = null;

        Human grandMoher1 = new Human();
        grandMoher1.name = "grandMoher1";
        grandMoher1.sex = false;
        grandMoher1.age = 60;
        grandMoher1.father = null;
        grandMoher1.mother = null;

        Human grandMoher2 = new Human();
        grandMoher2.name = "grandMoher2";
        grandMoher2.sex = false;
        grandMoher2.age = 60;
        grandMoher2.father = null;
        grandMoher2.mother = null;

        Human Father = new Human();
        Father.name = "Father";
        Father.sex = true;
        Father.age = 40;
        Father.father = grandFather1;
        Father.mother = grandMoher1;

        Human Mother = new Human();
        Mother.name = "Father";
        Mother.sex = false;
        Mother.age = 40;
        Mother.father = grandFather2;
        Mother.mother = grandMoher2;

        Human Child1 = new Human();
        Child1.name = "Child1";
        Child1.sex = false;
        Child1.age = 10;
        Child1.father = Father;
        Child1.mother = Mother;

        Human Child2 = new Human();
        Child2.name = "Child2";
        Child2.sex = false;
        Child2.age = 10;
        Child2.father = Father;
        Child2.mother = Mother;

        Human Child3 = new Human();
        Child3.name = "Child3";
        Child3.sex = false;
        Child3.age = 10;
        Child3.father = Father;
        Child3.mother = Mother;

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMoher1);
        System.out.println(grandMoher2);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Child1);
        System.out.println(Child2);
        System.out.println(Child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
