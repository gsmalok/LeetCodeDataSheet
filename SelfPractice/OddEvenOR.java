package SelfPractice;

public class OddEven {
    public static void main(String[] args) {
        
        int number = 101;

        if((number | 1 ) > number){
          System.out.println("even");
        }else{
            System.out.println("Odd");
        }
    }
}
