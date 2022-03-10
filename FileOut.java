import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {
    public static void main(String[] args) {

        // try {
        // FileOutputStream fOut = new FileOutputStream("./Files//testout.txt");
        // } catch (FileNotFoundException e) {
        // // TODO: handle exception
        // System.out.println(e);
        // }

        // try {
        // fOut.write(543); // -Write Byte
        // fOut.close();

        // System.out.print("Success\n");
        // } catch (IOException fE) {
        // // TODO: handle exception
        // System.out.println(fE);
        // }

        try {
            FileOutputStream fOut = new FileOutputStream("./Files//testout.txt");

            String s = "Jana Gandu!";

            byte b[] = s.getBytes();

            fOut.write(b); // -Write String (byte string)
            fOut.close();
            System.out.print("Success\n");
            fOut.close();
        } catch (IOException fE) {
            // TODO: handle exception
            System.out.println(fE);
        } finally {
            System.out.println("Finally");
        }
    }
}