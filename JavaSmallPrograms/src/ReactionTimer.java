import java.util.Scanner;

public class ReactionTimer {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("After you see 'GO', press a random key and then press 'enter' to see your reaction time.");
        Thread.sleep(4000);
        System.out.println("3");
        Thread.sleep(1000); // wait for one second before print out 2, mimic countdown
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO!!!!!");

        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        scanner.next();
        long endTime = System.currentTimeMillis();
        long reactionTime = endTime - startTime;
        System.out.println("Your reaction time is " + reactionTime + " ms.");
    }
}
