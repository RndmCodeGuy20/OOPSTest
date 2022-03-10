import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        try {

            if (num >= 50 || num <= 10) {
                scan.close();
                throw new outOfRange("Invalid Number!!!");
            } else {
                System.out.println("Square of the number : " + num*num);
            }

        } catch (outOfRange oRange) {
            // TODO: handle exception
            oRange.printStackTrace();
        }
        scan.close();
    }
}

class outOfRange extends RuntimeException {
    outOfRange(String msg) {
        super(msg);
    }
}