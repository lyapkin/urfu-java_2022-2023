package lr8.Task1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inFile = new FileInputStream("d:/MyFile2.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            InputStream inURL = new URL("http://google.com").openStream();
            readAllByByte(inURL);
            System.out.print("\n\n\n");
            inURL.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {65, 73, 66, 32, 102});
            readAllByByte(inArray);
            inArray.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
