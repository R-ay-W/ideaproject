package com.bjsxt.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class TestFile {


    public static void main(String[] args) throws IOException {
        File f1 = new File("src/com/bjsxt/File/jjj");
        System.out.println(f1);
        System.out.println(System.getProperty("user.dir"));

        f1.mkdir();

    }
}
enum Season{
    Spring, Summer, Fall, Winter
}
