package lr8.Task1;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Created");
                System.out.println("Full path1 : " + f1.getAbsolutePath());
            }

            File f2 = new File("D:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Full path2 : " + f2.getAbsolutePath());

            File f3 = new File("D:\\Folder1\\Folder2\\Folder3");
            f3.mkdirs();
            System.out.println("Full path3 : " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
