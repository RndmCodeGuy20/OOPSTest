public class RectangleProb {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(30, 40);
        Rectangle rect2;
        rect2 = rect1.getRectObj();

        System.out.println("rect1.length : " + rect1.length);
        System.out.println("rect2.length : " + rect2.length);
        System.out.println("rect1.breadth : " + rect1.breadth);
        System.out.println("rect2.breadth : " + rect1.breadth);
    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    Rectangle getRectObj() {
        Rectangle rect = new Rectangle(10, 20);
        return rect;
    }
}