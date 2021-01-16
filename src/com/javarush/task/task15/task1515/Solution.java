package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {

    public static int A;
    public static int B;
    public static  int MIN;



    public static void main(String[] args)  {
        A = Integer.parseInt(read());
        B = Integer.parseInt(read());
        MIN =  min(A, B);
        System.out.println(MIN);


    }


    private static String read()  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
             s =reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            if (s.equals("")){
                System.out.println("enter some number");
            }
             return s;


        }



    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
