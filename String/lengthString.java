package String;

import java.util.*;

public class lengthString {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner (System.in)) {
            String  A = scn.next();
            String B = scn.next();

            String C = A + B;
            System.out.println(C.length());

            System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
        }
    }
}

