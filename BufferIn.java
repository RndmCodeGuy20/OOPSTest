import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferIn {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        FileInputStream fIn = new FileInputStream("./Files//testout.txt");
        BufferedInputStream bIn = new BufferedInputStream(fIn);

        int i;

        while ((i = bIn.read()) != -1) {
            System.out.print((char) i);
        }

        bIn.close();
        fIn.close();
    }
}
