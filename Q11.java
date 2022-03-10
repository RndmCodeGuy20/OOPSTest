public class Q11 {
    public double printArea(int side) {
        return (side * side);
    }

    public double printArea(int l, int b) {
        return (l * b);
    }

    public double printArea(Double h, Double l) {
        return ((1/2.0) * h * l);
    }

    public static void main(String[] args) {
        Q11 area = new Q11();

        System.out.println("Square : " + area.printArea(4));
        System.out.println("Triangle : " + area.printArea(2.9, 1.2));
        System.out.println("Rectangle : " + area.printArea(4, 6));
    }
}
