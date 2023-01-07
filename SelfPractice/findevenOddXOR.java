package SelfPractice;


public class findevenOddXOR {
    public static void main(String[] args) {
        int number = 99092;
        if((number ^ 1) == (number + 1)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
