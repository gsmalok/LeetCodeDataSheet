package String;
import java.math.BigInteger;
public class AddString {

             public static String AddStringBigInteger(String num1, String num2) {
                BigInteger  input1 = new BigInteger(num1);
                BigInteger input2 = new BigInteger(num2);
                 
                BigInteger Sum ; 
                Sum = input1.add(input2);
                return Sum.toString();
             }
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "1";
        System.out.println(AddStringBigInteger(str1, str2));

    }//
}
