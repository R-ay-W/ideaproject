package com.bjsxt.File;

import java.io.File;


public class PrintFile {

    public static void printFile(File file, int level) {
        if(file.isDirectory() || file.getName().toLowerCase().endsWith(".pdf")){
            //输出层次数
            for (int i = 0; i < level; i++) {
                System.out.print("- ");
            }
            //输出文件名
            System.out.println(file.getName());
        }

        //如果file是目录，则获取子文件列表，并对每个子文件进行相同的操作
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File subfile : files) {
                //递归调用该方法，level+1
                printFile(subfile, level + 1);
            }
        }
    }

    public static void main(String[] args) {
        printFile(new File("D:\\DesktopFiles\\ECE650"), 0);
    }
}
