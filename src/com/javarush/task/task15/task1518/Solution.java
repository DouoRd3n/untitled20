package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    public static void main(String[] args) {
Cat cat = new Cat();
cat.name = "murka";
        System.out.println(cat.name);
    }
    public static class Cat{
        String name;
    }
}
