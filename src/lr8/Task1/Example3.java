package lr8.Task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        String fileName = "d://MyFile2.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Open/close file error: " + e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {

                }
            }
        }
    }

    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("Count = " + count +
                                 ", buff = " + Arrays.toString(buff) +
                                 ", str = " + new String(buff, 0, count, "utf8"));
            } else {
                break;
            }
        }
    }
}
