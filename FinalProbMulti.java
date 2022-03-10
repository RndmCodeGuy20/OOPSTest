import java.util.Random;

/**
 * @author RndmCodeGuy20
 * 
 * @brief Final internal test assignment of Multi-threading.
 * 
 * @copyright © Shantanu Mane 2021
 */

public class FinalProbMulti {
    public static void main(String[] args) {
        OddEvenThread threadOE = new OddEvenThread();
        threadOE.start();   // -First Thread Starts...
    }// -The main thread will be started here. And, control will now be passed to <OddEvenThread> Class. goto Line 46
}

class cubeODD extends Thread {
    int n;  
    
    // -Since now the thread has been started... The execution also starts, value of the var </randNum/> is passed to the class constructor.
    cubeODD(int num) {
        n = num;
    }

    @Override
    public void run() {     // -Inbuilt (Abstract) run() method is then overrided, and the inner statements are executed accordingly.
        // TODO Auto-generated method stub
        System.out.println("Cube of random number " + n + " is : " + (n * n * n));
    }
}

class squareEVEN extends Thread {
    int n;

    squareEVEN(int num) {
        n = num;
    }

    @Override
    public void run() {
        // TODO: Auto-generated method stub
        System.out.println("Square of random number " + n + " is :" + (n * n));
    }
}

class OddEvenThread extends Thread {    // -Control is now passed here...

    @Override
    public void run() {     // -Abstract Method run() is overrided here.
        // TODO: Auto-generated method stub

        Random randInt = new Random();  // -To generate a random number we include the <Random> Class

        for (int i = 0; i < 10; i++) {
            int randNum = randInt.nextInt(10);  // -A random number is generated and is assigned to variable </randNum/>

            if (randNum % 2 == 1) {     // -Checking the nature of the random number generated.

                cubeODD cube = new cubeODD(randNum);    // -Value of randNum
                cube.start();   // -If randNum is ODD then control is passed to <cubeODD> class by starting the class' thread. Goto line 18.

            } else {

                squareEVEN square = new squareEVEN(randNum);
                square.start();

            }

            try {

                Thread.sleep(1000);     // -After each iteration there is a gap of (long) 1000 milliseconds = 1 seconds.

            } catch (InterruptedException IEe) {

                // TODO: handle exception
                System.out.println(IEe);

            }
        }   // `for` loop ends here...
    }
}

/**
 *      *OUTPUT
 * PS D:\OOPSTest> javac .\FinalProbMulti.java
 * PS D:\OOPSTest> java FinalProbMulti
 * Square of random number 2 is :4
 * Square of random number 4 is :16
 * Square of random number 6 is :36
 * Cube of random number 9 is : 729
 * Cube of random number 5 is : 125
 * Square of random number 4 is :16
 * Square of random number 4 is :16
 */