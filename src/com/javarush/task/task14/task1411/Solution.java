package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        for (int i = 0; i < 4; i++) {


            //тут цикл по чтению ключей, пункт 1
            key = reader.readLine();

            //создаем объект, пункт 2
            person = getPerson(key, person);
            doWork(person); //вызываем doWork

        }
    }

    private static Person getPerson(String key, Person person) {
        if (key.equals("User")) {
            person = new Person.User();
        } else if (key.equals("Loser")) {
            person = new Person.Loser();
        } else if (key.equals("Coder")) {
            person = new Person.Coder();
        } else if (key.equals("Proger")) {
            person = new Person.Proger();
        }
        return person;
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
