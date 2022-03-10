public class Q1 {
    String Name, City, Age;

    Q1(String Name, String City, String Age) {
        this.Name = Name;
        this.City = City;
        this.Age = Age;
    }

    public void printData() {
        System.out.println("\nName : " + Name + "\n" + "City : " + City + "\n" + "Age  : " + Age + "\n");
    }

    public static void main(String[] args) {
        Q1 stud1 = new Q1("Shantanu", "Nagpur", "19");
        Q1 stud2 = new Q1("Ved", "Mumbai", "18");

        stud1.printData();
        stud2.printData();
    }
}
