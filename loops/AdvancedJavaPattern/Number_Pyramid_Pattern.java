package loops.AdvancedJavaPattern;

public class Number_Pyramid_Pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            int spaces= n-i;
            //spaces
            //agr you are confused abt spaces...if i=1 then spaces=5-1=4...so the computer will print spaces like 1,2,3,4 and so on
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //numbers--> print row number, row number times
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
