package SelfPractice;
public class Armstrong_Number {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // an integer such that the sum of the cubes of its digits is equal to the i itself. 
        // example is 371 1741725, 4210818, 9800817, 9926315
        
        int number = 100;
        for(int i=1; i<=number; i++){
            int temp = i;
            int temp1 = i;
            int count = 0; 
            double arm = 0;
            while(temp1!=0){
                temp1 = temp1/10;
                count++;
            }
            while(temp != 0){
                final double rem = temp%10;
                 arm = arm + Math.pow(rem,count );
                 temp=temp/10;
            }
            if(i==arm){
                System.out.print(" " + i);
            } 
        }
       
    }
}
