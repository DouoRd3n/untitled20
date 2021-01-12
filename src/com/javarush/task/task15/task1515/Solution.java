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

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        A = read();
        B = read();
        System.out.println(MIN);
    }

    private static int read() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
       try {
           i = Integer.parseInt(reader.readLine());
       } catch (IOException e) {
           e.printStackTrace();
       }
           return i;

    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
