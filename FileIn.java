import java.io.FileInputStream;
import java.io.IOException;

public class FileIn {
    public static void main(String[] args) {
        try {
            FileInputStream fIn = new FileInputStream("./Files//testout.txt");

            // int i = fIn.read(); // -Read single character
            // System.out.print((char) i);

            int i = 0;

            while ((i = fIn.read()) != -1) {
                System.out.print((char) i);
            }

            fIn.close();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
