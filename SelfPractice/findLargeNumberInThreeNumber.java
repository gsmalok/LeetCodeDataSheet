package SelfPractice;

public class findLargeNumberInThreeNumber {
    public static void main(String[] args) {
            
             int x = 10;
             int y = 43;
             int z = 34;

             
             int largeNumber = x>((y>z)?y:z)?x:((y>z)?y:z);
             System.out.println(largeNumber);
    }
}
