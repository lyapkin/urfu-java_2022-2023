package lr8.Task1;

import java.io.*;

public class Example10 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = null;
        PrintWriter wr = null;
        PrintWriter print = new PrintWriter(System.out);

        try {
            rd = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("d:/MyFile1.txt"),
                            "utf8"
                    )
            );
            wr = new PrintWriter("d:/MyFile2.txt");

            int lineCount = 0;
            String s;
            while ((s = rd.readLine()) != null) {
                lineCount++;
                print.println(lineCount + ": " + s);
                wr.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            print.println();
        } finally {
            rd.close();
            wr.flush();
            wr.close();
            print.flush();
            print.close();
        }
    }
}
