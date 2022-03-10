public class Q8 {
    public static void main(String[] args) {
        Shape trap = new Trapezoid();
        Shape tria = new Triangle();
        Shape hex = new Hexagon();

        trap.numofSides();
        tria.numofSides();
        hex.numofSides();
    }
}

abstract class Shape {
    abstract void numofSides();
}

class Trapezoid extends Shape {
    @Override
    void numofSides() {
        // TODO Auto-generated method stub
        System.out.println("Number of sides in a trapezoid is 4!");
    }
}

class Triangle extends Shape {
    @Override
    void numofSides() {
        // TODO Auto-generated method stub
        System.out.println("Number of sides in a triangle is 3!");
    }
}

class Hexagon extends Shape {
    @Override
    void numofSides() {
        // TODO Auto-generated method stub
        System.out.println("Number of sides in a hexagon is 6!");
    }
}