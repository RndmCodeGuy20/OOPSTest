import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q9 {
    public static void main(String[] args) {
        String fileName = "phone.txt";
        String line;

        try {
            File file = new File(fileName);
            FileReader fRead = new FileReader(file);
            BufferedReader bRead = new BufferedReader(fRead);

            try {
                while ((line = bRead.readLine()) != null) {
                    System.out.print(line);
                    System.out.println();
                }
            } catch (IOException io) {
                System.out.println(io);
            }

        } catch (FileNotFoundException f) {
            // TODO: handle exception
            System.out.println(f);
        }
    }
}
