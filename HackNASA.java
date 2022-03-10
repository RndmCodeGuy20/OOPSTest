public class HackNASA {
    public static void main(String[] args) {
        System.out.println("Hacking NASA servers...!");
        int min = 1000;
        int max = 3000;

        try {
            for (int i = 0; i <= 10; i++) {
                int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

                Thread.sleep(random_int);
                System.out.print(i * 10 + "% " + " ");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        System.out.println("\nNASA servers successfully hacked!!!");
    }
}
