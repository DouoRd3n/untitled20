package com.javarush.task.task14.task1420;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean keyA = true;
        int a = 0;
        int b = 0;


            try {
                 a = Integer.parseInt(reader.readLine());
            }catch (NumberFormatException e){
                System.out.println("Enter number");



        }


            try {
                 b = Integer.parseInt(reader.readLine());
            }catch (NumberFormatException e){
                System.out.println("Enter number");

            }




        int nod = nod(a,b);
        System.out.println(nod);
    }

    private static int nod(int a, int b) {
        while (a!=0 && b!=0){
            if (a>b){
                a = a-b;
            }else {
                b=b-a;
            }
        }
        if (a == 0){
            return b;
        } else {
            return a;
        }
    }
}
