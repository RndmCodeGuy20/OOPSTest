public class Q6 {
    public static void main(String[] args) {
        Circle cir = new Circle(5, "(4,3)");
        cir.printData();
    }
}

class Circle {
    int Rad;
    String Cent;

    Circle(int rad, String cent) {
        Rad = rad;
        Cent = cent;
    }

    public void printData() {
        System.out.println("\nRadius : " + Rad + "\nCenter : " + Cent);
    }
}