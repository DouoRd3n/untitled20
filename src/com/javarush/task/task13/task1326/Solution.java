package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("E:\\sorse.txt")));
        BufferedReader reader = new BufferedReader(inputStreamReader);
        ArrayList<Integer> list = new ArrayList<>();
        while (reader.ready()){
            list.add(Integer.parseInt(reader.readLine()));
        }
        inputStreamReader.close();
        reader.close();

        System.out.println(list.toString());
        Collections.sort(list);
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i)%2==0){
                System.out.println(list.get(i));
            }
        }

    }
}