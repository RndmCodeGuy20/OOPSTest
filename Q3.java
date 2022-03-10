public class Q3 implements Sum, Add {

    @Override
    public void printAdd() {
        // TODO Auto-generated method stub
        System.out.println("Add running!");
    }

    @Override
    public void printSum() {
        // TODO Auto-generated method stub
        System.out.println("Sum running!");
    }

    public static void main(String[] args) {
        Q3 Q31 = new Q3();

        Q31.printAdd();
        Q31.printSum();
    }
}

interface Sum {
    public void printSum();
}

interface Add {
    public void printAdd();
}