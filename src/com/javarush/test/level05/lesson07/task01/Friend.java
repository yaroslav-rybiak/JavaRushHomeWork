package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Friend
{
    String name;
    int age;
    Boolean isMale;
    //напишите тут ваш код
    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, Boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
}
