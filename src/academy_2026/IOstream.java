package academy_2026;

import java.io.*;

public class IOstream {
    public static void main(String[] args) throws IOException {
//        String basePath="/home/fred/Desktop/code/academy/academy2024";
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {
            sourceStream
                    = new FileInputStream("sourcefile.txt");
            targetStream
                    = new FileOutputStream("targetfile.txt");
            String text = "Filestream";
            targetStream.write(text.getBytes());

            // Reading source file and writing content to target file byte by byte
            int temp;
            while ((
                    temp = sourceStream.read())
                    != -1)
                targetStream.write((byte)temp);
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }

        try{
            BufferedReader reader = new BufferedReader(
                    new FileReader("targetfile.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        }
        catch (IOException e) {
            System.out.println(
                    "An error occurred while reading the file: "
                            + e.getMessage());
        }

        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("targetfile.txt"));

            writer.write("Hello, World!");
            writer.newLine();
            writer.write(
                    "This is written using BufferedWriter.");

            writer.close();
            System.out.println(
                    "File written successfully.");
        }
        catch (IOException e) {
            System.out.println("An error occurred: "
                    + e.getMessage());
        }
    }
}
