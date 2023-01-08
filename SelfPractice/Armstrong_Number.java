package SelfPractice;
import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args) {
        
        // an integer such that the sum of the cubes of its digits is equal to the number itself. 
        // example is 371 
        
        int number = 54748;
        int temp = number;
        int temp1 = number;
        int count = 0; 
        double arm = 0;
        while(temp1!=0){
            temp1 = temp1/10;
            count++;
        }
        while(temp != 0){
            double rem = temp%10;
             arm = arm + Math.pow(rem,count );
             temp=temp/10;
        }
        if(number==arm){
            System.out.println("It is Armngstrong Numner");
        }else{
            System.out.println("Not Armangstrong");
        }
    }
}
