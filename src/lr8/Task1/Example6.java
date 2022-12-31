package lr8.Task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) throws IOException {
        FileReader rd = null;
        FileWriter wr = null;
        try {
            rd = new FileReader("d:/MyFile1.txt");
            wr = new FileWriter("d:/MyFile2.txt", true);

            int oneByte;
            while ((oneByte = rd.read()) != -1) {
                wr.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            rd.close();
            wr.close();
        }
    }
}
