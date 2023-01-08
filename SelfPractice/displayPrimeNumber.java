package SelfPractice;

public class displayPrimeNumber {
    public static void main(String[] args) {
        
           int number = 30;

        for(int j=2 ; j<=number ; j++){  // to optimistic code
             
           boolean temp = false;

           for(int i= 2 ; i*i<=j; i++){
            if( j%i==0){
                temp = true;
            }
           
           }
           if(!temp){
            System.out.print(" " + j);
           }
        //    else{
        //     System.out.println("Not Prime");
        //    }
        }
    }
}
