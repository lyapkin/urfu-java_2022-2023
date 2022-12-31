package lr8.Task1;

import java.io.*;

public class Example9 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = null;
        BufferedWriter wr = null;

        try {
            rd = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("d:/MyFile1.txt"),
                            "utf8")
            );
            wr = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("d:/MyFile2.txt"),
                            "utf8"
                    )
            );

            int lineCount = 0;
            String s;
            while ((s = rd.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                wr.write(lineCount + ": " + s);
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
