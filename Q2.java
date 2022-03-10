public class Q2 {
    public static void main(String[] args) {
        Q2Abs q = new Q2E();
        q.printData();
        q.printDataAbs();
    }
}

abstract class Q2Abs {
    abstract void printData();

    public void printDataAbs() {
        System.out.println("Printing from abstract class!");
    }
}

class Q2E extends Q2Abs {
    @Override
    void printData() {
        // TODO Auto-generated method stub
        System.out.println("Call me from Q2E!");
    }
}