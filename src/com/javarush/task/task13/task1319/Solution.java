package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        OutputStream outputStream =new FileOutputStream(readConsole());
        InputStream inStrim = new FileInputStream("e:/sorse.txt");

        saveBeforPutStop(outputStream);
        prinfOfFile(inStrim);

    }

    private static void prinfOfFile(InputStream inStrim) throws IOException {
        String text = "";
        while (inStrim.available()>0){
            char c = (char) inStrim.read();
            text = text + c;

        }
        System.out.println(text);
        inStrim.close();
    }

    private static void saveBeforPutStop(OutputStream outputStream) throws IOException {

        while (true){
            String key = readConsole();
            if (key.equals("exit")){
                break;
            }else {
                saveToFile(outputStream, key);
            }

        }
        outputStream.close();


    }

    private static void saveToFile(OutputStream outputStream, String text) throws IOException {

        char[] chars = text.concat(" ").toCharArray();

        for (int i = 0; i <chars.length ; i++) {
            outputStream.write(chars[i]);

        }



    }



    private static String readConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        return text;
    }
}
