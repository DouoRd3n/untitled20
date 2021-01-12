package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();


    public static void main(String[] args) {
        labels.put(10d, "qweqwe");
        labels.put(11d, "sdfdsf");
        labels.put(12d, "sdfsdf");
        labels.put(13d, "sdfsdf");
        labels.put(14d, "sdfsdf");
        System.out.println(labels);
    }
}
