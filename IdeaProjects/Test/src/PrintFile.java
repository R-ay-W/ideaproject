//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PrintFile {
    public PrintFile() {
    }

    public static void printFile(File file, int level) {
        if (file.isDirectory() || file.getName().toLowerCase().endsWith(".pdf")) {
            for(int i = 0; i < level; ++i) {
                System.out.print("- ");
            }

            System.out.println(file.getName());
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            File[] var3 = files;
            int var4 = files.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                File subfile = var3[var5];
                printFile(subfile, level + 1);
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
//        printFile(new File("D:\\DesktopFiles\\ECE650"), 0);
        FileReader reader = new FileReader("D:\\\\DesktopFiles\\\\ECE650");
    }

}
