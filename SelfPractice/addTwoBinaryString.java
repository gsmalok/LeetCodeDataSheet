package SelfPractice;

public class addTwoBinaryString {
    public static void main(String[] args) {
        
        String str1 = "10";
        String str2 = "1";

        int number1 = Integer.parseInt(str1,2);
        int number2 = Integer.parseInt(str2,2);

        int sum = number1 + number2;

        System.out.println(Integer.toBinaryString(sum));
    }
}
