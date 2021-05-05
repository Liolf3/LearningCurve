// LearningCurve/CoinFlip.java
// Coin-flipping program
package LearningCurve;
import java.util.*;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        System.out.println("Heads or tails?");
        String s = cn.nextLine();

        Random rand = new Random();
        int c = rand.nextInt(2) + 1;

        if (c == 1 && s.equalsIgnoreCase("heads")) {
            System.out.println("Yay! It's heads!");
        }
        else if (c == 1 && s.equalsIgnoreCase("tails")) {
            System.out.println("Nope! It's heads!");
        }
        else if (c == 2 && s.equalsIgnoreCase("tails")) {
            System.out.println("Yeah! It's tails.");
        }
        else if (c == 2 && s.equalsIgnoreCase("heads")) {
            System.out.println("Nope! It's tails.");
        }
    }
}