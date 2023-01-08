package SelfPractice;

// import javax.lang.model.util.ElementScanner14;

public class Leap_Year {
    public static void main(String[] args) {
        
        int year = 1900;
         
           if(year%100==0 ){ 
                if(year%400==0){
                    System.out.println("leap year");
                }else{
                    System.out.println("Not Leap Year");
                }
                   }
                else if(year%4==0){
                    System.out.println("leap year");
                }
              else{
                System.out.println("Not leap Year");
              }            

           

          
    }
}
