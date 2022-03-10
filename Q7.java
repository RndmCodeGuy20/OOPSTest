public class Q7 {
    static int count = 0;

    Q7() {
        count++;
    }

    public static void main(String[] args) {
        Q7 q1 = new Q7();
        Q7 q2 = new Q7();
        Q7 q3 = new Q7();
        Q7 q4 = new Q7();


        System.out.println("Number of instances created : " + count);
    }
}
