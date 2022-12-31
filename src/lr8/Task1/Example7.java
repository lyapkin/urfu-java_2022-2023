package lr8.Task1;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = null;
        BufferedWriter wr = null;

        try {
            rd = new BufferedReader(new FileReader("d:/MyFile1.txt"), 1024);
            wr = new BufferedWriter(new FileWriter("d:/MyFile2.txt"));

            int lineCount = 0;
            String s;
            while ((s = rd.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                wr.write(s);
                wr.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            rd.close();
            wr.flush();
            wr.close();
        }
    }
}
