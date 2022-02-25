package com.bjsxt.Exception;

import java.io.FileReader;
/**try with resources, a resource is an object that must be closed after the program is finished with it*/
public class Test2 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("d:/a.txt");) {
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println("" + c + c2);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("testeeeeeeeeeee");
    }


}
