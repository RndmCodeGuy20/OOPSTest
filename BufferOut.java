import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOut {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fOut = new FileOutputStream("./Files//testout.txt");

        BufferedOutputStream bOut = new BufferedOutputStream(fOut);

        String S = "How Are Ye?";

        byte b[] = S.getBytes();

        bOut.write(b);
        bOut.flush();
        bOut.close();
        fOut.close();
    }
}
