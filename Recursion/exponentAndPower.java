package Recursion;

public class exponentAndPower {//stack height = n
    public static int printexpo(int x, int n){
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int x_ = printexpo(x,n-1);
        int xn= x * x_;
        return xn;
    }

    public static void main(String[] args) {
        int x=2, n=5;
        int output = printexpo(x,n);
        System.out.println(output);
    }
}
