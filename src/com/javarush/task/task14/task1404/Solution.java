package com.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        CatFactory catFactory = new CatFactory();

        List<Cat> listCat = doAction();
        printListCat(listCat);
    }

    private static void printListCat(List<Cat> listCat) {
        for (int i = 0; i < listCat.size() ; i++) {
            System.out.println(listCat.get(i).toString());
        }
    }

    private static ArrayList<Cat> doAction() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Cat> list = new ArrayList<>();
        while (true){

            try {
                String key = reader.readLine();
                if (key.equals("")){
                    break;
                }else{
                    list.add(CatFactory.getCatByKey(key)) ;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } return list;
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
