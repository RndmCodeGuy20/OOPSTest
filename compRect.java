/**
 * @author RndmCodeGuy20 (shantanu.mane.200@outlook.com)
 * 
 * @version 1.0.12
 */

public class compRect {
    Double Len, Wid, Ar;
    String Col;

    public void getLength(Double L) {
        Len = L;
    }

    public void getWidth(Double W) {
        Wid = W;
    }

    public void getColour(String Col) {
        this.Col = Col;
    }

    public Double findArea() {
        Ar = Len * Wid;
        return Ar;
    }

    public static void main(String[] args) {
        compRect rec1 = new compRect();
        compRect rec2 = new compRect();

        rec1.getLength(3.289);
        rec1.getWidth(2.23);

        rec2.getLength(3.297);
        rec2.getWidth(2.3999);

        if (rec1.findArea() >= rec2.findArea()) {
            System.out.println("Rectangle 1 is bigger!" + "\nArea : " + rec1.findArea());
        } else {
            System.out.println("Rectangle 2 is bigger!" + "\nArea : " + rec2.findArea());
        }
    }

}
