package SelfPractice;

public class ToFindGCD {

    public static int GCD(int u, int v) {
        if (u == 0)
        return v;
    return GCD(v % u, u);
        
    }
    public static void main(String[] args) {
        
        int x = 25;
        int y = 15;
        System.out.println(GCD(x, y));
    }
}
