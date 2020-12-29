package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStrim = new FileInputStream(reader.readLine());
        ArrayList<Character> listChar = getListChar(inStrim);
        inStrim.close();
        printList(listChar);

    }

    private static void printList(ArrayList<Character> listChar) {
        String result ="";
        for (int i = 0; i <listChar.size() ; i++) {
            result = result+listChar.get(i);
        }

        System.out.println(result);
    }

    private static ArrayList<Character> getListChar(InputStream inStrim) throws IOException {
        ArrayList<Character> list = new ArrayList<>();
        while (inStrim.available()>0){

            int data = inStrim.read();
            list.add((char) data);
        }
        return list;
    }
}