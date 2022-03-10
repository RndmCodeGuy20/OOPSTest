import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String PrimeNums = "";

        int num = scan.nextInt();
        int numb = 0;

        for (int i = 0; i < num; i++) {
            int counter = 0;
            for (numb = i; numb >= 1; numb--) {
                if (i % numb == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                PrimeNums = PrimeNums + i + " ";
            }
        }

        System.out.println("Prime Numbers are : " + PrimeNums);

        scan.close();
    }
}
