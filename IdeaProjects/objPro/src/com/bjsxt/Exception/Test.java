package com.bjsxt.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("d:/a.txt");
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println("" + c + c2);
        } catch (FileNotFoundException e) {  //子类在前   public class FileNotFoundException extends IOException
            e.printStackTrace();
        } catch (IOException e) {  //父类在后
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("testttttttt");


    }
}
