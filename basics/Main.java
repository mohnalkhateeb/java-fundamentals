import java.util.Random;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(5);
        // flipNHeads(7);
        // flipNHeads(1);
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        clock();
                        // your code here

                    }
                },
                1000,1000
        );

    }

    // Functions that return nothing have a return type of "void"
    public static void loopTo(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println("Loop #" + i);
        }
    }

    // This function has a return type of "int"
    public static int multiplyByTwo(int n) {
        return n * 2;
    }
    public static String pluralize(String bet, int betCount) {
        String betStr =  bet;
        if (betCount == 0 || betCount > 1) {
            betStr =  bet + "s";
        }

        return betStr;
    }

    public static void flipNHeads(int headr)
    {
        int flip =0;
        int headCount =0;
        while (true)
        {
            Random rand = new Random();
            float rand_float = rand.nextFloat();
            flip=flip+1;
            if(rand_float < 0.5)
            {
                System.out.println("tails");
                headCount=0;
            }
            else
            {
                System.out.println("heads");
                headCount=headCount+1;
                if(headCount == headr) break;
            }
        }
        System.out.println("It took"+" "+ flip+" "+ "flips to flip"+ " "+ headCount +" "+"head in a row.");
    }
    public static void clock()
    {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);

    }
    
}