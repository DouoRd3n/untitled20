package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов

*/


public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String link = "";
        double d;
        try {
            link = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here
        int a = link.lastIndexOf("?");
        String temp = link.substring(a+1);
        String [] part = temp.split("&");
        for (int i = 0; i < part.length ; i++) {
            if (part[i].contains(";")){
              list.add(part[i].substring(part[i].lastIndexOf(";")+1));
            }else {
                list.add(part[i]);
            }
        }

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).contains("=")){
                System.out.print(list.get(i).substring(0,list.get(i).lastIndexOf("=")) + " ");

            } else {
                System.out.print(list.get(i)+" ");
            }
            }
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).contains("obj")){
                System.out.println("");
                try {
                    alert(Double.parseDouble(list.get(i).substring(list.get(i).lastIndexOf("=")+1)));
                } catch (Exception e){
                    alert(list.get(i).substring(list.get(i).lastIndexOf("=")+1));
                }

        }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
