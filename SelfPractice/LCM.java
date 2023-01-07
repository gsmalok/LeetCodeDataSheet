package SelfPractice;

public class LCM {

    public static int GCD(int x, int y) {
        if(x==0)
        return y;
        return GCD(y%x, x);  
    }

    public static int LCMfind(int u, int v) {
         return (u/GCD(u, v))*v; 
    }
    public static void main(String[] args) {
        System.out.println(LCMfind(15, 25));
    }
    
}
