package SelfPractice;
import java.util.*;
public class Practice {
    int forA;
    int forB;
    int forC;
    int forD;

    public  Practice(int A, int B, int C, int D) {
        this.forA = A;
        this.forB = B;
        this.forC = C;
        this.forD = D;
    }

    public void PrtinValue() {
        System.out.println(this.forA + " " + this.forB + " " + this.forC + " " + this.forD);       
    }

    public static Practice ActionPerform(Practice n1, Practice n2   ) {
        Practice  result = new Practice(0, 0, 0, 0);

        result.forA = n1.forA + n2.forA;
        result.forB = n1.forB - n2.forB;
        result.forC = n1.forC * n2.forC;
        result.forD = n1.forD / n2.forD;
        return result;
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner (System.in)) {
            int input1 = scn.nextInt();
            int input2 = scn.nextInt();
            int input3 = scn.nextInt();
            int input4 = scn.nextInt();

            int input5 = scn.nextInt();
            int input6 = scn.nextInt();
            int input7 = scn.nextInt();
            int input8 = scn.nextInt();
            
            Practice c1 = new Practice(input1, input2, input3, input4);
            Practice c2 = new Practice(input5, input6, input7, input8);

            Practice finalResult = ActionPerform(c1, c2);

            finalResult.PrtinValue();
        }
    }

}
