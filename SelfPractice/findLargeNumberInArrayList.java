package SelfPractice;
import java.util.*;
public class findLargeNumberInArrayList {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            int z = scn.nextInt();
            ArrayList <Integer> large = new ArrayList<>();

            large.add(x);
            large.add(y);
            large.add(z);
            System.out.println(Collections.max(large));
        }
    }
}
