package SelfPractice;

public class displayPrimeNumber {
    public static void main(String[] args) {
        
           int number = 33;

        for(int j=2 ; j<=number ; j++){
             
           boolean temp = false;

           for(int i= 2 ; i< j;i++){
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
