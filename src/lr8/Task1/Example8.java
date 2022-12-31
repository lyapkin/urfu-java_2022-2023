package lr8.Task1;

import java.io.*;
import java.net.URL;

public class Example8 {
    public static void main(String[] args) throws IOException {
        try {
            InputStream iFile = new FileInputStream("d:/MyFile1.txt");
            InputStreamReader rd = new InputStreamReader(iFile, "utf8");
            readAllByByte(rd);
            System.out.println("\n\n\n");
            iFile.close();
            rd.close();

            InputStream iURL = new URL("http://google.com").openStream();
            rd = new InputStreamReader(iURL, "utf8");
            readAllByByte(rd);
            System.out.println("\n\n\n");
            iURL.close();
            rd.close();

            InputStream iArr = new ByteArrayInputStream(new byte[] {43,120,3,7,9});
            rd = new InputStreamReader(iArr, "utf8");
            readAllByByte(rd);
            iArr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void readAllByByte(InputStreamReader in) throws IOException {
        int oneByte;
        while (true) {
            oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
