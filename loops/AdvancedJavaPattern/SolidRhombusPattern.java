package loops.AdvancedJavaPattern;

public class SolidRhombusPattern {
    public static void main(String[] args) {
        int n=5;
         for(int i=1;i<=n;i++){
             //spaces-->This adds the slant before the stars...stars will continue to print right next to the spaces and all you have to do is run your code like a hollow rectangle
             int spaces= n-i;
             for(int j=spaces;j>=0;j--){
                 System.out.print(" ");
             }
             //stars
             for (int j=1;j<=n;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
//