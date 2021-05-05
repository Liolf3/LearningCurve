// LearningCurve/CoinFlip.java
// Coin-flipping program
package LearningCurve;
import java.util.*;

public class CoinFlip {
    public static void main(String[] args) {
        Random rand = new Random();
        String h = "Heads!";
        String t = "Tails!";
        int coin = rand.nextInt(2) + 1;
        if (coin == 1) {
        System.out.println(h);
        }
        else {
            System.out.println(t);
        }
    }
}